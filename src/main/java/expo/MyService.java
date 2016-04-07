package expo;

import java.io.IOException;
import java.net.URLEncoder;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Matti Tahvonen
 */
@Service
class MyService {

    /**
     * This methods signs you to the competition. It will also post your post
     * your solutions to the competition server for manual validation. If there
     * is an issue when singing up, a runtime exception is thrown.
     * 
     * @param email the email of the participant
     * @param name the name of the participant
     */
    public void signUp(String email, String name) {

        try {
            String java = IOUtils.toString(getClass().getResource("MyUI.java"));

            java = URLEncoder.encode(java, "UTF-8");
            name = URLEncoder.encode(name, "UTF-8");
            email = URLEncoder.encode(email, "UTF-8");

            RestTemplate restTemplate = new RestTemplate();
            String url = "http://vaad.in/submit?name=%s&email=%s&java=%s";
            url = String.format(url, name, email, java);

            String response = restTemplate.getForObject(url, String.class);

            if (!"Success!".equals(response)) {
                throw new RuntimeException("Saving entity failed:" + response);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}

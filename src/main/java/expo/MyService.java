package expo;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.vaadin.server.Page;
import com.vaadin.ui.Notification;

import expo.domain.EmailSubscription;

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
    public void signUp(EmailSubscription s) {

        try {
        	
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<EmailSubscription> entity = new HttpEntity<EmailSubscription>(s,headers);
            String url = "http://vaad.in/submitj1";
            url = "http://localhost:8080/submitj1";
            try {
                restTemplate.put(url, entity);
                Notification notification = new Notification("Congrats!", "You are now signed up for the lottery!");
                notification.setDelayMsec(5000);
                notification.show(Page.getCurrent());
            } catch (RestClientException e) {
                Notification.show("Saving entity failed: " + e.getMessage(), Notification.Type.ERROR_MESSAGE);
                return;
            }

        } catch (Exception ex) {
                Notification.show("Saving entity failed: " + ex.getMessage().substring(0, 28) + "...", Notification.Type.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }

}

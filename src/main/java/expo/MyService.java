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
     * Posts subscription details to a server that takes care of sending you
     * a personalized message, based on your interests.
     * 
     * @param s the subscription details
     */
    public void signUp(EmailSubscription s) {

        try {
        	
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<EmailSubscription> entity = new HttpEntity<EmailSubscription>(s,headers);
            String url = "http://vaad.in/submitj1";
            try {
                restTemplate.put(url, entity);
                Notification notification = new Notification("Congrats!", "Your details were submitted correctly, you should soon receive an email with tips to get started with Vaadin.");
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

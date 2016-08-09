package expo;

import com.vaadin.annotations.Theme;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickListener;

import expo.domain.InterestType;
import expo.domain.EmailSubscription;
import org.springframework.beans.factory.annotation.Autowired;

@Theme("valo")
@SpringUI
public class MyUI extends UI {

    // This Spring service is your backend. It has been autowired thanks to springframework
    @Autowired
    MyService service;

    final TextField name = new TextField("Name");
    final TextField email = new TextField("Email");
    final Label text = new Label("Click on the button below to get an email with <b>video tutorials</b> and more to help you get started with the <b>open source Vaadin Framework</b>.",ContentMode.HTML);

    @Override
    protected void init(VaadinRequest request) {
        
    	// Add the two textfields created above to a layout and make 
    	// that the main layout of the view
        final VerticalLayout layout = new VerticalLayout(name, email, text);
        setContent(layout);
        
        // Bind a POJO for name and email to this view 
        EmailSubscription s = new EmailSubscription();
        BeanFieldGroup.bindFieldsUnbuffered(s, this);
        
        // Create and add a button to the screen 
        Button button = new Button("Send email");
        layout.addComponents(button);
        
        /* TODO 
         * Create a ClickListener for the button and call the service (Autowired above)
         * whenever somebody clicks on the button. 
         *
         * ClickListener listener = e -> {
         *    Notification.show("Thanks " + name.getValue() + ", now check your inbox!");
         *    service.signUp(s);
         *  };
		 * button.addClickListener(listener);
		 */
        
		// Some visual styling for the layout for nicer look 'n' feel. 
		// Alternatively doable in CSS/Sass
        layout.setMargin(true);
        layout.setSpacing(true);
    }

}

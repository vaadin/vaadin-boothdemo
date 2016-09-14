package expo;

import com.vaadin.annotations.Theme;
import com.vaadin.data.BeanBinder;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
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
    final Label text = new Label("Click on the button below to get an email with"
            + " <b>video tutorials</b> and more to help you get started with the"
            + " <b>open source Vaadin Framework</b>.", ContentMode.HTML);

    @Override
    protected void init(VaadinRequest request) {

        final VerticalLayout layout = new VerticalLayout(name, email, text);
        setContent(layout);

        // Bind a POJO for name and email to this view 
        EmailSubscription subscription = new EmailSubscription();
        BeanBinder<EmailSubscription> binder = new BeanBinder<>(EmailSubscription.class);
        binder.bind(name, "name");
        binder.bind(email, "email");
        binder.load(subscription);

        // Create and add a button to the screen (http://demo.vaadin.com/sampler/#ui/interaction/button)
        Button button = new Button("Send email");
        layout.addComponents(button);
        // TODO: Call service.signUp(subscription) when button is clicked 

        // Visual styling for the layout for nicer look 'n' feel. 
        layout.setMargin(true);
        layout.setSpacing(true);
    }

}

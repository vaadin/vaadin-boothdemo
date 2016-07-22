package expo;

import com.vaadin.annotations.Theme;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickListener;

import expo.domain.InterestType;
import expo.domain.EmailSubscription;
import org.springframework.beans.factory.annotation.Autowired;

@Theme("valo")
@SpringUI
public class MyUI extends UI {

    // This Spring service will be your gateway to sign up for free spam
    @Autowired
    MyService service;

    final TextField name = new TextField("Name");
    final TextField email = new TextField("Email");
    final OptionGroup interestTypes = new OptionGroup("Subscriptions");


    @Override
    protected void init(VaadinRequest request) {

        // TODO: Modify the following code to query name and email, and pass 
        // those values to service (already autowired Spring service) in button
        // click listener. After successful service call, show a helpful
        // notification on the UI.
        
        final VerticalLayout layout = new VerticalLayout(name, email, interestTypes);

        EmailSubscription s = new EmailSubscription();

        interestTypes.setMultiSelect(true);
        interestTypes.addItems(InterestType.values());
        
        BeanFieldGroup.bindFieldsUnbuffered(s, this);
        
        Button button = new Button("Save");
        ClickListener listener = e -> {
            Notification.show("Thanks " + name.getValue() + ", it works!" + s.toString());
            service.signUp(s);
        };
        
		button.addClickListener( listener);
        
        layout.addComponents(button);
        layout.setMargin(true);
        layout.setSpacing(true);
        
        SubscriptionEditor editor = new SubscriptionEditor();
        editor.interestTypes.setMultiSelect(true);
        editor.interestTypes.removeAllItems();
        editor.interestTypes.addItems(InterestType.values());
        editor.save.addClickListener(listener);
        BeanFieldGroup.bindFieldsUnbuffered(s, editor);
        layout.addComponents(editor);
        
        setContent(layout);

    }

}

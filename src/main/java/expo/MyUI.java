package expo;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@Theme("valo")
@SpringUI
public class MyUI extends UI {

    // This Spring service will be your gateway to sign up for the competition
    @Autowired
    MyService service;

    @Override
    protected void init(VaadinRequest request) {
        
        // Replace this code with your competition answer, see README for 
        // more instructions
        final VerticalLayout layout = new VerticalLayout();
        
        final TextField name = new TextField();
        name.setCaption("Type your name here:");

        Button button = new Button("Click Me");
        button.addClickListener( e -> {
            Notification.show("Thanks " + name.getValue() + ", it works!");
        });
        
        layout.addComponents(name, button);
        layout.setMargin(true);
        layout.setSpacing(true);
        
        setContent(layout);

    }

}

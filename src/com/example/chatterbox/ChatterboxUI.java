package com.example.chatterbox;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
<<<<<<< HEAD
=======
import com.vaadin.ui.HorizontalLayout;
>>>>>>> 907b2617e5b794fbe432851303b5c54baad55bb9
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

<<<<<<< HEAD
=======

>>>>>>> 907b2617e5b794fbe432851303b5c54baad55bb9
@SuppressWarnings("serial")
@Theme("chatterbox")
public class ChatterboxUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = ChatterboxUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
<<<<<<< HEAD
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);
		
		final ChatText chatBox = new ChatText();
		
=======
		final VerticalLayout vLayout = new VerticalLayout();
		vLayout.setMargin(true);
		setContent(vLayout);
		
		HorizontalLayout hLayout = new HorizontalLayout();
>>>>>>> 907b2617e5b794fbe432851303b5c54baad55bb9

		Button button = new Button("Click Me");
		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
<<<<<<< HEAD
				chatBox.addChat("Hello World");
			}
		});
		layout.addComponent(chatBox);
		layout.addComponent(button);
=======
				vLayout.addComponent(new Label("Thank you for clicking"));
			}
		});
		vLayout.addComponent(button);
>>>>>>> 907b2617e5b794fbe432851303b5c54baad55bb9
	}

}
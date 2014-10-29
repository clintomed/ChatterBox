package com.example.chatterbox;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
@Theme("chatterbox")
public class ChatText extends CustomComponent{
	public Panel panel;
	public VerticalLayout pLayout;
	public ChatText(){
		panel = new Panel("ChatterBox Chat demo");
		pLayout = new VerticalLayout();
		panel.setContent(pLayout);
		
		panel.getContent().setSizeUndefined();
		panel.setSizeUndefined();
		setSizeUndefined();
		setCompositionRoot(panel);
		
	}
	
	public void addChat(String message){
		Label label = new Label(message);
		pLayout.addComponent(label);
	}
	
}

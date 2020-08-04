package com.JerseyDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.JerseyDemo.database.Database;
import com.JerseyDemo.model.Message;

public class MessageService {
	
	private Map<Long , Message> messages = Database.getMessages();
	
	public MessageService() {
		messages.put(1L,new Message(1,"newbie here ","neeraj"));
		messages.put(2L,new Message(2,"specilaist here ","uday"));
	}
	
	public List<Message> getAllMessages(){
				return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(Long id) {
		return messages.get(id);
	}
	
	public String addMessage(Message mesg) {
		mesg.setId(messages.size()+1);
		messages.put(mesg.getId(),mesg);
		return " !! Added Message !!";
	}
	
	public String updateMessage(Message mesg) {
		if(mesg.getId() <= 0) {
			return " !! invalid message !!" ;
		}
		messages.put(mesg.getId(), mesg);
		return " Updated " ;
	}
	
	public String deleteMessage(Long id) {
		messages.remove(id);
		return "Deleted";
	}
	
	
}

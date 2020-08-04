package com.JerseyDemo.resources;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.JerseyDemo.model.Message;
import com.JerseyDemo.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") Long id) {
		return messageService.getMessage(id); 
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addMessage(Message mesg) {
		return messageService.addMessage(mesg);
	}
	
/*	@PUT
	@Produces(MediaType.APPLICATION_XML)
	public Message updateMessage() {
			Long id = 2;
			messageService.updateMessage(mesg)
	}*/
}

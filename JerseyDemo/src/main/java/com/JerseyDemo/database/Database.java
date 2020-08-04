package com.JerseyDemo.database;

import java.util.HashMap;
import java.util.Map;

import com.JerseyDemo.model.Message;
import com.JerseyDemo.model.profile;
public class Database {
	private static Map<Long , Message> messages = new HashMap<>();
	private static Map<Long , profile> profiles = new HashMap<>();
	
	public static Map<Long , Message> getMessages(){
		return messages;
	}
	
	public static Map<Long , profile > getProfiles(){
		return profiles;
	}
	
}

package com.JerseyDemo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class profile {
	private long id;
	private String fname;
	private String lname;
	
	public profile() {};
	
	
	public profile(long id, String fname, String lname) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
}

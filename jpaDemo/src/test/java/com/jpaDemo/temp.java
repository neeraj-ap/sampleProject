package com.jpaDemo;

import javax.persistence.Entity;
import javax.persistence.Id;



// class name should be same as table name in database 

@Entity
public class temp {
	@Id
	private int id;
	private String fname ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return fname;
	}
	public void setName(String fname) {
		this.fname = fname;
	}
	
	@Override
	public String toString() {
		return "temp [id=" + id + ", name=" + fname + "]";
	}
	
	
}

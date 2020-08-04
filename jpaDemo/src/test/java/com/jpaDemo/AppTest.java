package com.jpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppTest 
{
	public static void main(String  []args) {
		
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		 EntityManager  em = emf.createEntityManager();
		  
		 // to enter the data into database
		 temp t1 = new temp();
		 t1.setId(4);
		 t1.setName("kiran");
		 em.getTransaction().begin();
		 em.persist(t1);
		 em.getTransaction().commit();
		 
		 // to get the data from the database
		 temp t = em.find(temp.class,4);
		 System.out.println(t);
		 
		 // to print complete table 
		 System.out.println("complete table temp");
		 for(int i=0;i<4;i++) {
			 temp t2 = em.find(temp.class, i+1);
			 System.out.println(t2);
		 }
		 
	}
	
} 
package com.app.raghu.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestOperations {
	
	public static void main(String[] args) {
		EntityManagerFactory tx=null;
		
		try {
			//1. Load Driver creates DB connections prepare statement
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("AppDB");
			System.out.println(emf.getClass().getName());
			
			//2.TODO operation
			EntityManager em = emf.createEntityManager();
			System.out.println(em.getClass().getName());
			tx=(EntityManagerFactory) em.getTransaction();
			System.out.println(tx.getClass().getName());
			
			
			
		}catch(Exception e) {
			//rollback if any problem
			
		}
		
	}

}

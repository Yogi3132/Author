package com.capg.service;

import java.util.Scanner;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.myauthor.*;
public class Service {
	private static EntityManagerFactory emf =
	          Persistence.createEntityManagerFactory("pu");

	public static void main(String[] args) {
		     try {
	    	
	    	doRemove();
	    	
	    	
	      } finally {
	    	  emf.close();
	      }
	  }
	 public static void doSave() {
	  	  
	      System.out.println("1 "+emf);
	      EntityManager em = emf.createEntityManager();
	      System.out.println("2 "+em);
	      Author dc = new Author("mohan", "singh", "sharma", 9812);
	    
	      System.out.println(" 3 "+dc);
	      em.getTransaction().begin();
	      System.out.println(" 4 Transaction started ");
	      em.persist(dc );
	      System.out.println("inside transaction");
	      System.out.println(" 5 Persist called ");
	      em.getTransaction().commit();
	      System.out.println(" 6 commit ");
	      em.close();
	      System.out.println("closed ");
	  }
	public static void doUpdate()
	  { 
		  System.out.println("1 "+emf);
  EntityManager em2 = emf.createEntityManager();	
  System.out.println("2 "+em2);
  Scanner sc=new Scanner(System.in);
  System.out.println("what you want to update enter the primary key and column name");
  String pk=sc.nextLine();
  int id=Integer.parseInt(pk);
  String col_name=sc.nextLine();
 
  Author dc2=em2.find(Author.class,id);

  em2.getTransaction().begin();
  
  System.out.println("transcation started");
  if(col_name.contentEquals("firstName"))
  {
	  System.out.println("enter the first name");
	  String fn=sc.nextLine();
	  dc2.setFirstName(fn);
  }
  if(col_name.contentEquals("middleName"))
  {
	  System.out.println("enter the middle name");
	  String mn=sc.nextLine();
	  dc2.setFirstName(mn);
  }
  if(col_name.contentEquals("lasttName"))
  {
	  System.out.println("enter the last name");
	  String ln=sc.nextLine();
	  dc2.setFirstName(ln);
  }

  if(col_name.contentEquals("phoneNo"))
  {
	  System.out.println("enter the phoneNo");
	  int ph=sc.nextInt();
	  dc2.setPhoneNo(ph);
  }
  
  em2.getTransaction().commit();
  System.out.println("  committed  ");

 
      System.out.println(dc2);
  
  em2.close();

	  }
	
	public static void doRemove()
	  {
		  System.out.println("1 "+emf);
  EntityManager em3 = emf.createEntityManager();	
  System.out.println("2 "+em3);
  Scanner sc=new Scanner(System.in);
  System.out.println("what you want to update enter the primary key ");
  String pk=sc.nextLine();
  int id=Integer.parseInt(pk);
  Author dc3=em3.find(Author.class,id);

  em3.getTransaction().begin();
  
  System.out.println("transcation started");
  
  if(dc3.getAuthorId()==(id))
  { 
	  em3.remove(dc3);
	  
  }
  em3.getTransaction().commit();
  System.out.println("  committed  ");

 
  
  System.out.println(dc3);
  
  em3.close();

	  }
}

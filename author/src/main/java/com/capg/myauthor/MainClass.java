package com.capg.myauthor;

import java.util.Scanner;


import com.capg.service.Service;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Service se=new Service();
		
		System.out.println("Enter \n  1- Update\n  2-Remove\n  3-Save");
		int ch=sc.nextInt();
		switch (ch) {
		case 1:
			se.doUpdate();
			break;
		case 2:
			se.doRemove();
			break;
		case 3:
			se.doSave();
			break;
	
		default:
			System.out.println("Wrong choice");
			break;
		}
		
		
		
		 
		 
		 
		 
	}

	 
	  
	  
	  
	  
	  
	  
	  
	  
}

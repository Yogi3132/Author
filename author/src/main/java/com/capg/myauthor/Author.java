package com.capg.myauthor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="dc_details")
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int authorId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="middle_name")
	private String middleName;
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="phone_no")
	private int phoneNo;


	public Author( String firstName, String middleName, String lastName,int phoneNo) {
		super();
	
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
		this.phoneNo=phoneNo;
	}
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	

}

package com.first.discard;

public class Person implements Movable{
	String fname;
	String lname;
	String gender;
	
	
	
	public Person() {
		super();
	}


	public Person(String fname, String lname, String gender) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
	}


	String introduce() {
		return "I am "+fname +  lname ;
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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String move(String city) {
			return "Walk to"+city;
	}

}

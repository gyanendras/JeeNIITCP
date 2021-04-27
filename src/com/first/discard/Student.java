package com.first.discard;

import java.util.LinkedList;

public class Student extends Person{
	String courseName;
	
	
	
	String introduce() {
		return "I am "+ fname +" I study " +courseName ;
	}
	
	String introduce(String greeting) {
		return "greeting " 
	            + "I am "+ fname +" I study " +courseName ;
	}

	

	public Student(String courseName) {
		super("default",
				"default","default");
		this.courseName = courseName;
	}
	
	@Override
	public String move(String city) {
			return "Drive to"+city;
	}


	public static void main(String[] args) {
	
		Person person1 = new Person("Mohan","Singh","Male");
		Person person2 = new Student("CompSc");
		Student std =  new Student("Electrical");
		Movable mv = new Student("Mech");
		
		//Movable mv = ObjectFactory.getObject();new Student2020("Mech");
		
		Movable mv2 = new RegularStudent();
		
		Student[] studArr = new Student[10];
		studArr[0] = new Student("Mech");
		studArr[1] = new Student("Mech2");
		LinkedList ls = new LinkedList();
		ls.add(mv2);
		
		
		System.out.println(person1.introduce());
		System.out.println(person2.introduce());
		System.out.println(std.introduce("Hi"));
		System.out.println(person2.move("Delhi"));
		System.out.println(mv.move("Mumbai"));

	}

}

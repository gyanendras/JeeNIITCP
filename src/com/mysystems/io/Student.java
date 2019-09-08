package com.mysystems.io;

import java.util.HashMap;
import java.util.HashSet;

public class Student  implements Comparable{
	String fname;
	String lname;
	int rollnum;
	Integer abc = 10;
	double db = 4.44d;
	Double db1=4.44d;
	long lng = 99999999999999999l;
	String salutation;
	StringBuffer sb = new StringBuffer("Ntpc");
	String[] stuNum = {new String("12"),new String("34")};
	
	

	
	Student(){
		super();
		fname="default";
		lname="default";
		rollnum=0;
		salutation = "St.";
	}
	
	Student(String fname,String ln){
		this();
		this.fname=fname;
		lname=ln;
		
		
	}
	
	Student(String fname,String ln, int rnum){
		this(fname,ln);
		rollnum=rnum;
		
	}
	
	String getFname() {
		return this.fname;
	}
	
	void setFname(String fname) {
		this.fname =fname;
		
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	int printStudentDetails(Student st) {
		System.out.println(st.getFname()+ " "+ st.getLname());
		return st.getFname().length();
	}
	
    boolean printStudentDetails(Student st,Student st2){
		
	return true;
    }
    
    void modifyStudentDetails(Student st,int rollnum){
    	//st.setFname("Hi");
    	st.setRollnum(rollnum);
    	rollnum=6;
    	st.printStudentDetails(st);
    }
    
    void modifyStudentDetails(String fname,int rollnum){
      	fname="New HI";
      	rollnum=4;
      	
    }
    
    void modifyStudentDetails(StringBuffer sb1,int rollnum){
    	
    	sb1.reverse();
    	rollnum=4;
    	
    }
    
	
	public static void main(String[] args)  {
		Student s1 =null;
		s1= new Student();
		s1.setFname("Ram");
		
		Student s2 = new Student("Ram123456789","Singh",10);
		System.out.println(s1.fname+" "+s1.lname);
		System.out.println(s2.fname+" "+s2.lname);
		
		System.out.println(s2.getFname()+ " "+s2.getLname());
		//s2.modifyStudentDetails(s2.fname,s2.rollnum);
		try {
		s2.modifyStudentDetails(s2,s2.rollnum);
		System.out.println("After Excpetion ************");
		}catch(Exception e)
		{
			System.out.println("Pls inform admission department to abbreviate large names");
			e.printStackTrace();
		}
		
		
		s2.modifyStudentDetails(s2.sb,s2.rollnum);
		System.out.println(s2.getFname()+" "+s2.getRollnum()+" "+s2.sb);
		s2.abc.intValue();

		s2.setFname("Ram");
		s1.setLname("Singh");
		boolean isEqual = s1.equals(s2);
		System.out.println(isEqual);
		System.out.println(s1.hashCode());
		HashSet hs = new HashSet();
		HashMap hm = new HashMap();
		
		
	}

	
	@Override
	public boolean equals(Object i) {
		Student st = (Student)i;
		boolean checkEqual;
		checkEqual= this.fname.equals(st.getFname());
		checkEqual= checkEqual && this.lname.equals(st.getLname());
		return checkEqual;
		
		
	}

	@Override
	public int compareTo(Object o) {
		Student st =(Student)o;
		return this.fname.compareTo(st.getFname());
	}
	
	
	
	/*
	@Override
	public int hashCode() {
		//return fname.hashCode()+lname.hashCode() ;
		return 5;
		
	}*/
	
	

}

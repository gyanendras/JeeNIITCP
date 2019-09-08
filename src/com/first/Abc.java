package com.first;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Abc{
	protected int j;
	Abc(){};
	A a=new A();

	Abc b=new Abc();
	
	
	int Abc(){
		System.out.println("Hello "+ 10);
		return 10;
		
		};

	public  static void main(String[] args) {
		Abc x= new Abc();
		A objA = new A();
		System.out.println(objA.k);
		List<?> a = new ArrayList<Float>();
		List<? extends Number > c = new ArrayList<Float>();
		Number n= c.get(0) ;
		//Float f = c.get(0) ;
		List<Float > d = new ArrayList<Float>();
		d.add(3.14f);
		 c = new ArrayList<Double>();
		List<? super Integer > c1 = new ArrayList<Number>();
		x.Abc();
		//boolean j = a instanceof A.class;
		System.out.println();
		
		
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + j;
		return result;
	}
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Abc other = (Abc) obj;
		if (j != other.j)
			return false;
		return true;
	}
	
	

}

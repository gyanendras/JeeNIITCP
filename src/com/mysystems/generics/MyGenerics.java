package com.mysystems.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyGenerics {
	public void myGenerics() {
		List<String> myCol = new ArrayList<String>(); 
		myCol.add("Name1");
		myCol.add("Name2");
		List<?> myList = myCol;
		Object s = myList.get(0);
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		
		List<Vehicle> vehList = new ArrayList<Vehicle>();
		
		List<? extends Vehicle> vehList1 =new ArrayList<Car>();
		
		
		Car c1 = new Car();
		vehList.add(c1);
		
		
	}
	
	
	

	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
	    for (T o : a) {
	        c.add(o); // Correct
	    }
	}
	
class Vehicle{
	
	
}

class Car extends Vehicle{
	
}
	
}

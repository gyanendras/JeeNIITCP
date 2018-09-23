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
	}
	
	
	

	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
	    for (T o : a) {
	        c.add(o); // Correct
	    }
	}
	

}

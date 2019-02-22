package com.first;

import java.util.LinkedList;
import java.util.List;

public  interface MyInterface <T>{
	static List<? extends Number>  move(List<? super Integer>x){
		return new LinkedList<Float>();
		
	}

}

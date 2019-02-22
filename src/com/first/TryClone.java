package com.first;
final 
public class TryClone implements Cloneable {
 public  final String name;
 public  final int i=10;
 TryClone(String str){
	 name=str;
	 
 }
 public String getName() {
	return name;
}

public int getI() {
	return i;
}

 


	public static void main(String[] args) throws CloneNotSupportedException {
		TryClone tc = new TryClone("Hi");
		
		TryClone tcClone;
		
		tcClone=(TryClone) tc.clone();
		System.out.println(tcClone.getName());
	}

}

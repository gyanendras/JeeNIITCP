package com.first;

public abstract class ASub extends A  {
	static String x = "HelloXStatic";
	String [] argb = {"",""};
	static {
		System.out.println(x);
	}
	
	String y="WorldY";
	{
		System.out.println(y);
	}
	
	
	
	ASub(){
		System.out.println("In ASub Default Const");
	}
  abstract void aMethod() ;
	

	
		public static void main(String ... a) {System.out.println(new A());}

		
		
	

}

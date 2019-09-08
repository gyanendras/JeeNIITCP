package com.first;

interface MyLambda {
	boolean filter(int a,int b,int c);
}

/*java 1.8 +

Lambda Expressions/functional interface (Real time usage in project with examples)
Pipelines and Streams. (Real time usage in project with examples)
Default Methods 
((Real time usage in project with examples, what are the design pattern will be impacted)
Type Annotations.
Nashorn JavaScript Engine.
Concurrent Accumulators.
Parallel operations ((Real time usage in project with examples)
 

We need complete practical knowledge trainer 
(Not PPT with basic introduction) 
who can teach with experienced people (2 – 5 years).


Spring Core V5 with MVC Version 4 ( only XML based configuration real time examples)
Asynchronous MVC processing  ( real time usage)
Custom beans
Meta-annotations
JCache
Reactive programing
Function web framework
 

RESTful service (real time implementation of 
Producer and consumer with 
standard security and performance implementation
JPA
*/





public class LambdaPOC {
static void checkBetween(MyLambda mb, int num1, int num2,int num3) {
   if(mb.filter(num1,num2,num3)) {
	   System.out.println(num1+" "+num2+" "+num3);
   }
}
	public static  void main(String[] args) {
		MyLambda abc = (x,y,z)->x>y&& y<z;
		checkBetween(abc,7,5,6);
		
	}
}


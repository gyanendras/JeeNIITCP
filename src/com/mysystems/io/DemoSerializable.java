package com.mysystems.io;
import java.io.*; 

class Demo implements java.io.Serializable 
{ 
     public int a; 
     public String b;
     //public Student st =new Student("name1","name2");
   // MyIO st = new MyIO(); 
    // Default constructor 
    public Demo(int a, String b) 
    { 
        this.a = a; 
        this.b = b; 
    }
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	} 
    
    
  
} 
 
public class DemoSerializable {

	    public static void main(String[] args) 
	    {    
	        Demo object = new Demo(11, "testSerializable1"); 
	        String filename = "C:\\Users\\Gyan\\Documents\\file.ser"; 
	          
	        // Serialization  
	        try
	        {    
	            //Saving of object in a file 
	            FileOutputStream file = new FileOutputStream(filename); 
	            ObjectOutputStream out = new ObjectOutputStream(file); 
	              
	            // Method for serialization of object 
	            out.writeObject(object); 
	              
	            out.close(); 
	            file.close(); 
	              
	            System.out.println("Object has been serialized"); 
	  
	        } 
	          
	        catch(IOException ex) 
	        { 
	            System.out.println("IOException is caught"); 
	        } 
	  
	  
	        Demo object1 = null; 
	  
	        // Deserialization 
	        try
	        {    
	            // Reading the object from a file 
	            FileInputStream file = new FileInputStream(filename); 
	            ObjectInputStream in = new ObjectInputStream(file); 
	              
	            // Method for deserialization of object 
	            object1 = (Demo)in.readObject(); 
	              object1.getA();
	            in.close(); 
	            file.close(); 
	              
	            System.out.println("Object has been deserialized "); 
	            System.out.println("a method= " + object1.getA()); 
	            System.out.println("b = " + object1.b); 
	        } 
	          
	        catch(IOException ex) 
	        { 
	            System.out.println("IOException is caught"); 
	        } 
	          
	        catch(ClassNotFoundException ex) 
	        { 
	            System.out.println("ClassNotFoundException is caught"); 
	        } 
	  
	    } 
	
}

package com.mysystems.io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
public class ChainIO {

	  public static void main(String[] args) {
	 
	    String s;
	 
	    try {
	    	//File f = new File("myfile.txt");
	    	InputStream in = ChainIO.class.getResourceAsStream("myfile.txt");
	    	BufferedReader fr1 = new BufferedReader(new InputStreamReader(in)); 
	      FileReader fr = new FileReader("C:\\gyanLaptop\\cusp\\htmlTrn\\jdbcPoc\\jdbcPOC\\src\\com\\mysystems\\io\\myFile.txt");
	      //FileReader fr = new FileReader(f);
	      
	      BufferedReader br = new BufferedReader(fr);
	      LineNumberReader lr = new LineNumberReader(br);
	 
	      while ((s = lr.readLine()) != null)
	        System.out.println(lr.getLineNumber() + " " + s);
	 
	    } catch (IOException e) {
	      System.out.println(e.getMessage());
	    }
	  }
	}


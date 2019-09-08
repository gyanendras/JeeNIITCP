package com.mysystems.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//FileInputStream Exception
//Try with resource
//

public class MyIO {
	public void fileio() {
		File f = new File("myfile.txt");
		try (FileInputStream fis = new FileInputStream(f)) {
			int data = fis.read();
			while (data != -1) {
				System.out.print((char) data);
				data = fis.read();
				String str = "myname";
				str.compareTo("abc");

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void charFileIO()  {
		
		Reader fileReader = null;
		Writer fileWriter = null;
		try {
		fileReader = new FileReader("C:\\gyanLaptop\\cusp\\htmlTrn\\jdbcPoc\\jdbcPOC\\src\\com\\mysystems\\io\\myFile.txt");
		fileWriter = new FileWriter("C:\\gyanLaptop\\cusp\\htmlTrn\\jdbcPoc\\jdbcPOC\\src\\com\\mysystems\\io\\opFile.txt");
		
		int c = fileReader.read();
		while (c!=-1) {
			fileWriter.write(c);
			
			 c=fileReader.read();
			 System.out.println((char)c);
		}
		}catch(FileNotFoundException e) {
			System.out.println("");	
		}
		catch(IOException e) {
		System.out.println("");	
		}
	
		
	finally{
		try {
			fileReader.close();
			try {
			fileWriter.close();
			}catch(ArithmeticException e) {
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

		
	}
	

}
}

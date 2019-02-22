package com.mysystems.regularex.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import com.mysystems.regularex.MyRegexPOC;

class MyRegexPOCTest {

	@Test
	void testLookAhead() {
		MyRegexPOC myreg = new MyRegexPOC();
		myreg.lookAhead();
	
	}
		
	@Test
	void testR() {
		//2 uppercase,1-2 digit, 0-2 uppercase letters,1-4 digit number
		//, each part separate by space
	//boolean x= Pattern.matches("[A-Z]{2} \\d{1,2} ?[A-Z]{0,2} \\d{1,4}", "TS 13 123");
	boolean y= Pattern.matches("[A-Z]{2,4}-[A-Z0-9]{3,4} [A-Z]{2,4}-[A-Z0-9]{3,4}(/[ULWS]\\d{2})?","AB-A11 AA-B8B/S11");
	//boolean z =Pattern.matches("(/[ULWS]\\d{2})?","");
	//assertEquals(true,x);
	assertEquals(true,y);
	//assertEquals(true,z);
	int i=0;
	for(;i<10;) {
		
	}
	}
	
	
	@Test
	void testAny() {
		Pattern pat = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(.*[A-Z])(.*[#@!%])");
		String str = "8cD@";
		String str2 = "Dc8@";
		Matcher mt = pat.matcher(str2);
		//System.out.println(mt.matches());
		while(mt.find()) {
					System.out.println(mt.group());
					System.out.println(str2.substring(mt.start(),mt.end()));
		}
	
	}
  
	@Test
	void testK() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dateStr = formatter.parse("29-05-2010");
	}

}

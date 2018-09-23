package com.mysystems.regularex.test;

import static org.junit.jupiter.api.Assertions.*;

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


}

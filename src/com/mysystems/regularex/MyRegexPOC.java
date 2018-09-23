package com.mysystems.regularex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegexPOC {
public void lookAhead() {
	String str = "app boy cat a b c a b c bc ab";
	Pattern pat= Pattern.compile("(a)(b)(c)");
	Matcher mat = pat.matcher(str);
	while(mat.find()) {
		System.out.println(str.substring(mat.start(),mat.end()));
		System.out.println(mat.group());
	}
	
}
}

package com.first;

public class Palindrome {

	public boolean isPalindrome(String word) {
		boolean isPdrm = true;
		int len = word.length();
		for(int i=0;i<len;i++) {
			if(word.charAt(i)!=word.charAt(len-1-i)) {
				isPdrm = false;
			}
		}
		return isPdrm;
		
		
	}

}

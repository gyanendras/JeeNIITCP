package com.first.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.first.Palindrome;

class PalindromeTest {

	@Test
	void PalindromeTest() {
		Palindrome pm = new Palindrome();
		assertTrue(pm.isPalindrome("abba"));
		assertFalse(pm.isPalindrome("abbab"));
		assertTrue(pm.isPalindrome("madam"));
		assertTrue(pm.isPalindrome("Deleveled"));
	}

}

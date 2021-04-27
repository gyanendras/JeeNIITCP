package com.first.hackerank.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.first.hackerank.SparseArray;

class SparseArrayTest {

	@Test
	void testMatchingStrings() {
		String[] str = {"jk","ij"};
		String[] qr = {"ijk","ijk","ijk"};
		SparseArray.matchingStrings(str, qr);
	}

}

package com.first.pf;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class AddOneToArrayTest {

	@Test
	void testAddOneToList() {
		AddOneToArray aa = new AddOneToArray();
		int[] al = new int[]{8,9,9,9};
		
		int[] addOne =aa.addOneToList(al);
		System.out.println(Arrays.toString(addOne)); 
	}

}

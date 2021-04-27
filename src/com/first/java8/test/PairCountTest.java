package com.first.java8.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.first.java8.PairCount;

class PairCountTest {

	@Test
	void testCountPairs() {
		PairCount p = new PairCount();
		int pcount = p.countPairs(5, new int[]{1,1,2,2,4,4,4,2,2,2,2});
		assertEquals(5,pcount);
	}

}

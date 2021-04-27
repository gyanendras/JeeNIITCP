package com.first.hackerank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinimumSubsequenceTest {
	MinimumSubsequence ms =null;
	
	@BeforeEach
	void setUp() {
		 ms = new MinimumSubsequence();
	}
	
	@AfterEach
	void cleanUp() {
		 ms = null;
	}
	
	
	@Test
	void testMinSubSeq() {
		
		// int k = ms.minSubSeq("seed", "target");
		// assertEquals(0, k);
		int k1 = ms.minSubSeq("abc", "bcabc");
		assertEquals(2, k1);
		
		
	}
	
	@Test
	void testMinSubSeq_bc_bcabc() {
		int k2 = ms.minSubSeq("bc", "bcabc");
		assertEquals(0, k2);
	}
	
	@Test
	void testMinSubSeq_bc_cb() {
		int k2 = ms.minSubSeq("wbrcda", "cba");
		assertEquals(3, k2);
	}
	

	@Test
	void testMinSubSeq_abc_a() {
		int k3 = ms.minSubSeq("abc", "a");
		assertEquals(1, k3);
	}
	
	@Test
	void testMinSubSeq_abc_abc() {
		int k3 = ms.minSubSeq("abc", "abc");
		assertEquals(1, k3);
	}
	
	@Test
	void testMinSubSeq_abc_abcabc() {
		int k3 = ms.minSubSeq("abc", "abcbac");
		assertEquals(4, k3);
	}
	
	@Test
	void testMinSubSeq_abc_cba() {
		int k3 = ms.minSubSeq("abc", "cba");
		assertEquals(3, k3);
	}
	

	@Test
	void testMinSubSeq_a_a() {
		int k3 = ms.minSubSeq("a", "a");
		assertEquals(1, k3);
	}
	
	@Test
	void testMinSubSeq_a_b() {
		int k3 = ms.minSubSeq("a", "b");
		assertEquals(0, k3);
	}

}

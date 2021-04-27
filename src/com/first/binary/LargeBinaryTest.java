package com.first.binary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized.Parameters;

class LargeBinaryTest {

	@Test
	void test() {
		LargeBinary lb = new LargeBinary();
		// assertEquals(Long.valueOf("11011",2), lb.addBinary(3l),0.001);
		// assertEquals(Long.valueOf("11011100",2), lb.addBinary(4l),0.001);
		//String st = getBinary(17l);
		//assertEquals(Long.valueOf(st,2), lb.findNum(17l),0.001);
		 assertEquals(lb.findBigNumByLib(13l), lb.findNumWithShift(13l),0.001);
		// assertEquals(lb.findBigNumByLib(17l), lb.findNum(17l),0.001);
		//assertEquals(lb.findBigNumByLib(25l), lb.findNum(25l), 0.001);

	}

	String getBinary(Long num) {
		StringBuilder sb = new StringBuilder();

		for (long i = 1; i <= num; i++) {
			sb.append(Long.toBinaryString(i));
		}
		return sb.toString();
	}

	
	@ParameterizedTest
	@ValueSource(longs = { 1, 2, 3, 4,17 })
	void testFNum(long z) {
		LargeBinary lb = new LargeBinary();
		String st = getBinary(z);
		assertEquals(Long.valueOf(st, 2), lb.findNumWithShift(z), 0.001);

	}

	@ParameterizedTest
	@ValueSource(longs = { 1, 2, 3, 4,17,99999l })
	public void testFindNum(long z) {
		LargeBinary lb = new LargeBinary();
		System.out.println(lb.findBigNum(z));
	}
	
	@ParameterizedTest
	@ValueSource(longs = { 1, 2, 3,9, 14,17,18,20,30,99,9999l  })
	public void testFindNumBigIntTill17(long z) {
		LargeBinary lb = new LargeBinary();
		//System.out.println(lb.findNumBigInt(99l));
		assertEquals(lb.findNumWithShift(z), lb.findNumWithProduct(z));
		assertEquals(lb.findNumWithProduct(z), lb.findNumBigIntWithShift(z).longValue());
		assertEquals(lb.findNumWithProduct(z), lb.findNumBigIntWithProduct(z).longValue());
		//assertEquals(lb.findNumDouble(z), lb.findNumBigInt(z).longValue());
		//assertEquals(lb.findNum(999999l), lb.findNumBigInt(999999l).longValue());
	}
	
	
	@ParameterizedTest
	@ValueSource(longs = { 1, 2, 3,9, 14,17,18,20,30,99,9999 })
	public void testFindNumBigInt(long z) {
		LargeBinary lb = new LargeBinary();
		//System.out.println(lb.findNumBigInt(99l));
		//System.out.println(lb.findNum(17l) + " "+lb.findNumBigInt(17l));
		assertEquals(lb.findNumWithShift(z), lb.findBigNum(z));
		assertEquals(lb.findBigNum(z), lb.findNumBigIntWithProduct(z).longValue());
		//assertEquals(lb.findNumDouble(z),lb.findNumBigInt(z).longValue() );
		//assertEquals(lb.findNum(999999l), lb.findNumBigInt(999999l).longValue());
	}
	

}

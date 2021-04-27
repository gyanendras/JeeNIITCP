package com.first.binary;

import java.math.BigInteger;

public class LargeBinary {
	StringBuilder sb = new StringBuilder();

	public Long addBinary(Long n) {
		Long.toBinaryString(1); // 1 -- 2^3+ 2^2 + 2^1 + 2^0
		Long.toBinaryString(2); // 10
		Long.toBinaryString(3); // 11
		
		/*
		 * 100 010 110 11000 00011 11011
		 */
		// System.out.println(Long.toBinaryString(i));
		Long p1 = 1l;
		int len = 1;
		int lIndex = 1;
		long pow = 2;
		for (int i = 2; i <= n; i++) {
			// if(i==Math.pow(2,lIndex)) {len++;lIndex++;}
			if (i == pow) {
				len++;
				lIndex++;
				pow = 2 * pow;
			}
			// int len=(int)(Math.log(n) / Math.log(2)+1);
			System.out.println(len + " " + Long.toBinaryString(i).length());
			// len=Long.toBinaryString(i).length();
			Long p = p1 << len; // Long.toBinaryString(i).length();
			p1 = p | i;
		}

		System.out.println(p1);
		return p1;
	}

	public long findNumWithShift(long n) {
		long fNum = 1l;
		long bitLen = 1;
		long pow = 2;
		for (long i = 2; i <= n; i++) {
			if (i == pow) {
				bitLen++;
				pow = 2 * pow;
			}
			long p = fNum << bitLen;
			fNum = p | i;

		}
		return fNum;
	}
	
	
	
	
	public long findNumWithProduct(long n) {
		long fNum = 1l;
	
		long pow = 2;
		for (long i = 2; i <= n; i++) {
			if (i == pow) {
				
				pow = 2 * pow;
			}
			
			long p = fNum * pow;
			fNum = p | i;

		}
		return fNum;
	}
	
	public BigInteger findNumBigIntWithShift(long n) {
		BigInteger fNum = BigInteger.valueOf(1l);
		int bitLen = 1;
		long pow = 2;
		for (long i = 2; i <=n ; i++) {
			if (i == pow) {
				bitLen++;
				pow = 2 * pow;
			}
			BigInteger p = fNum.shiftLeft(bitLen) ;
			fNum = p.or(BigInteger.valueOf(i));
			
		}
		return fNum;
	}
	
	public BigInteger findNumBigIntWithProduct(long n) {
		BigInteger fNum = BigInteger.valueOf(1l);
		long pow = 2;
		for (long i = 2; i <=n ; i++) {
			if (i == pow) {
				pow = 2 * pow;
			}
			BigInteger p = fNum.multiply(BigInteger.valueOf(pow)); ;
			fNum = p.or(BigInteger.valueOf(i));
			
		}
		return fNum;
	}
	
	public double findNumDouble( double n) {
		double fNum = 1l;
		double bitLen = 1;
		double pow = 2;
		for (double i = 2; i <= n; i++) {
			if (i == pow) {
				bitLen++;
				pow = 2 * pow;
			}
			//long p = fNum << bitLen;
			double p = fNum * pow;
			fNum = p + i;

		}
		return fNum;
	}
	
	
	
	

	
	

	public long findBigNum(long n) {
		long fNum = 1l;
		long bitLen = 1;
		long pow = 2;
		for (long i = 2; i <= n; i++) {
			if (i == pow) {
				bitLen++;
				pow = 2 * pow;
			}
			long p = fNum << bitLen;
			fNum = p | i;

		}
		return fNum;
	}

	public long findBigNumByLib(long n) {
		//long fNum=0;
		String s=null;
		for (long i = 1; i <= n; i++) {
			s = Long.toBinaryString(i);
			sb.append(s);

		}
		return Long.valueOf(sb.toString(), 2);

	}
}

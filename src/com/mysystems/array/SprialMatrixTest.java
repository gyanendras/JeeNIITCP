package com.mysystems.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SprialMatrixTest {

	@Test
	void testSimpleMatrix() {
		int[][] sm = new SprialMatrix().simpleMatrix();
	for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(sm[i][j]+" ");
				
			}
			System.out.println();
	}
	}
	
	@Test
	void testPrintSpiralMatrix() {
		//int[][] sm = new SprialMatrix().simpleMatrix();
		int[][] sm = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int size = sm.length;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(sm[i][j]+" ");
				
			}
			System.out.println();
	}
		new SprialMatrix().printSpiralMatrix(sm);
	}
}

package com.mysystems.array;

import java.util.Scanner;

public class SprialMatrix {
int [][] simpleMatrix(){
	Scanner sn = new Scanner(System.in);
	int size = sn.nextInt();
	int[][] sm = new int[size][size];
	int count=0;
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			sm[i][j]=sn.nextInt();
			
		}
	}
	return sm;
}

void printSpiralMatrix(int [][] sm) {
	//int[][] sm = new SprialMatrix().simpleMatrix();
	int m=sm[0].length;
	for(int i=0;i<m-1;++i) {
		loopRow(i,0,0,m,sm);
		loopCol(i,m-i,m,m,sm);
		loopRowRev(m-i,m,0,m,sm);
		loopColRev(0,m-i,1,1,sm);
	}
}

private void loopColRev(int i, int m, int j, int k, int[][] sm) {
	for(int x=0;x<m-1-1-i;x++) {
		System.out.print(sm[m-1-1-i-x][i]+" ");
		
	}
	
}

private void loopRowRev(int m, int m2, int i, int m3, int[][] sm) {
	for(int x=0;x<m-1-i;x++) {
		System.out.print(sm[m-1-i][m-1-1-i-x]+" ");
		
	}
	
}

private void loopCol(int i, int m, int m2, int m3, int[][] sm) {
	for(int x=i;x<m-1-i;x++) {
		System.out.print(sm[x+1][m-1-i]+" ");
		
	}
	
}

private void loopRow(int i, int j, int k, int m, int[][]sm) {
	for(int x=i;x<m-i;x++) {
		System.out.print(sm[i][x]+" ");
		
	}
	
}
}

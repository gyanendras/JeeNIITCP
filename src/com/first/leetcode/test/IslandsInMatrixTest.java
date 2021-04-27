package com.first.leetcode.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.first.leetcode.IslandsInMatrix;

class IslandsInMatrixTest {

	@Test
	void testNumIslands() {
		char[][] grid = { 
				{ '1', '1', '1', '0', '0' }, 
				{ '1', '1', '0', '1', '0' }, 
				{ '1', '1', '0', '0', '0' },
				{ '0', '0', '1', '1', '0' } 
		};
		
		IslandsInMatrix im = new IslandsInMatrix();
		System.out.println(im.numIslands(grid));
	}
	
	@Test
	void testNumIslandsWithInput() {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		char [][] grid = new char[rows][cols];
		
		for (int i = 0 ; i < rows ; i++) {
		for (int j = 0 ; j < cols ; j++) {
			grid[i][j] = scan.next().charAt(1);
		}
		scan.nextLine();
		}
		
		IslandsInMatrix im = new IslandsInMatrix();
		System.out.println(im.numIslands(grid));
	}

}

package com.mysystems.array;

import java.util.Arrays;
import java.util.Comparator;

public class Array2D {
	
	
	
	
	int[][] sortBy2DCol(int[][] entry){
		Arrays.sort(entry,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// sort by 2nd col
				
	                return o1[1] - o2[1];
	         
				
				
			}
			
		});
		
		return entry;
	}

	public Integer[][] sort2DRows(Integer[][] entry) {
		
		Arrays.sort(entry[0],new Comparator<Integer>() {

			 @Override
			public int compare(Integer o1, Integer o2) {
				// sort by 1st col
				return o1-o2;
			}	});
		
		Arrays.sort(entry[1],new Comparator<Integer>() {

			 @Override
			public int compare(Integer o1, Integer o2) {
				// sort by 1st col
				return o1-o2;
			}	});
		
		Arrays.sort(entry[2],new Comparator<Integer>() {

			 @Override
			public int compare(Integer o1, Integer o2) {
				// sort by 1st col
				return o1-o2;
			}	});
		
		return entry;
	}

	public Object[][] sortBy2DColObj(Object[][] entry) {
		Arrays.sort(entry,new Comparator<Object[]>() {

			@Override
			public int compare(Object[] o1, Object[] o2) {
				// sort by 2nd col
				
	                return (int)o1[1] - (int)o2[1];
	         
				
				
			}
	});
		
		return entry;
	}
	
	

}

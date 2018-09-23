package com.mysystems.array;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

class Array2DTest {
	@Test
	void myDateTests() {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int m =cal.get(Calendar.MONTH);
		int year =cal.get(Calendar.YEAR);
		System.out.println(day + " " +m+" "+year);
		cal.set(year,m-1,day);
		System.out.println(cal.getTime());
	
		
	}

	@Test
	void testSortBy2DCol() {
		int[][] entry = {{1,5,2},
		{4,6,8},
		{2,2,1}
		};
		
		for (int i = 0; i < entry.length; i++) {
            for (int j = 0; j < entry[i].length; j++) {
                System.out.print(entry[i][j] + " ");
            }
            System.out.println(); 
            
        }
		System.out.println();
		
		Array2D a2d = new Array2D();
		int[][] entrySorted = a2d.sortBy2DCol(entry);
	       // Display the sorted Matrix
        for (int i = 0; i < entrySorted.length; i++) {
            for (int j = 0; j < entrySorted[i].length; j++)
                System.out.print(entrySorted[i][j] + " ");
            System.out.println();
        }
		System.out.println();
	}
	
	
	@Test
	void testSort2DRows() {
		Integer[][] entry = {{10,15,12},
		{4,6,8},
		{2,3,1}
		};
		
		for (int i = 0; i < entry.length; i++) {
            for (int j = 0; j < entry[i].length; j++) {
                System.out.print(entry[i][j] + " ");
            }
            System.out.println(); 
            
        }
		System.out.println();
		
		Array2D a2d = new Array2D();
		Integer[][] entrySorted = a2d.sort2DRows(entry);
	       // Display the sorted Matrix
        for (int i = 0; i < entrySorted.length; i++) {
            for (int j = 0; j < entrySorted[i].length; j++)
                System.out.print(entrySorted[i][j] + " ");
            System.out.println();
        }
		System.out.println();
	}

	
	@Test
	void testLab() {
		//int[] input={30,40,20,25};
		int[] input={30,30,30,25};
		//int[] input={40,30,40,55};
		Object[][] entry = new Object[3][2];
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
            	if(j==0) {entry[i][j]="L"+i;}
            	if(j==1) {entry[i][j]=input[i]-input[3];}
                System.out.print(entry[i][j] + " ");
            }
            System.out.println(); 
            
        }
		System.out.println();
		
		Array2D a2d = new Array2D();
		Object[][] entrySorted = a2d.sortBy2DColObj(entry);
	       // Display the sorted Matrix
        for (int i = 0; i < entrySorted.length; i++) {
            for (int j = 0; j < entrySorted[i].length; j++)
                System.out.print(entrySorted[i][j] + " ");
            System.out.println();
        }
		System.out.println();
		
		if((int)entrySorted[2][1]<0) {
			System.out.println("No Labs");
			return;
		}
		
		int min =0;
		label:
		 for (int i = 0; i < entrySorted.length; i++) {
	            for (int j = 0; j < entrySorted[i].length; j++){
	                if((int)entrySorted[i][1]>0 && min==0) {
	            	  	min=(int)entrySorted[i][1];
	            	  	System.out.print(entrySorted[i][0]);
	            	  	continue label;
	                }
	            }
	            
	            if((int)entrySorted[i][1]==min) {
	            	System.out.print(","+entrySorted[i][0]);
	            }
	          	          
	        }
		
	}
	
	

	
	
	
	
	@Test
	void testArr(){
		int[] x = new int[10];
		int i;
	for(i = 0 ; i<10;i++ ) {
		System.out.println(x[i]);
	}
		
	}
	
	
	
	
	
}

package com.mysystems;

class BreakWithLabelDemo {
    public static void main(String[] args) {

        int[][] arrayOfInts = { 
            { 32, 87, 3, 589 },
            { 12, 1076, 2000, 8 },
            { 622, 127, 77, 955 }
        };
        int searchfor = 12;
        
        
        int i;
        int j = 0;
        
        	for(i = 0; i < arrayOfInts.length; i++) {
        		System.out.println("In previous loop");
        		
        	}
        boolean foundIt = false;
        search:    
        for (i = 0; i < arrayOfInts.length; i++) {
        	//search: 
            for (j = 0; j < arrayOfInts[i].length;
                 j++) {
            	//search:  
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                   System.out.println("Before Search");
                    break search;
                }
            System.out.println("After Search");
            }
        System.out.println("After Search1");
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }

}

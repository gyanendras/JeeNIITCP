package com.first.java8;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class PairCount {

	public int countPairs(int n, int[] ar) {
	     IntStream s = Arrays.stream(ar);

	            HashMap<Integer,Integer> hm = new HashMap<>();
	            
	            int y = s.
		        map(x->{
		            if (hm.get(x)!=null) hm.put(x,hm.get(x)+1);
		            else {hm.put(x,1);}
		            return 1;
		              
		         } )
		      // .peek(x-> System.out.println(x))
		        .sum();
   	
	            return (int)(hm.values().stream().map(x->(int)Math.floor(x/2))).mapToInt(x->x).sum();
		
	}

}

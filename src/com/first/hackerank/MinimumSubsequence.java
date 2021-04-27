package com.first.hackerank;

import java.util.HashSet;

public class MinimumSubsequence {
   
	
	public int minSubSeq(String seed, String target) {
	   HashSet<String> minsubseq = new HashSet<>();
	   String temp = target;
	   int numSubSeq = 0, j = 0;
	   boolean strEnds = false;
	   String targetSub = null;
	   for(int i=0;i<=target.length()+1;i++) { 
		  // String sub = seed.substring(j, i);
	  if(i> target.length()) {
		  targetSub = target.substring(j,i-1);
		   strEnds = true;
	  } else {
		  targetSub = target.substring(j,i);
	  }
	  
		  if(!seed.contains(targetSub) || strEnds) 
		     { 
		      if(!seed.contains(targetSub) && targetSub.length() == 1) {
		    	  numSubSeq = 0;
		      break;
		      }
		      minsubseq.add(temp) ;
		      numSubSeq++ ;
		      j=--i;
		      if(strEnds) break;
		  }else {
			  temp = targetSub;
		  }
		  }
	
	return numSubSeq;
	}

}

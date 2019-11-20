package com.first.pf;

public class AddOneToArray {

	public int[] addOneToList(int[] al) {
		int sum=0;
		boolean nextlen=false;
		for(int i=0;i <al.length;++i) {
			sum=sum+al[al.length-i-1]*(int)Math.pow(10,i);
			if(al[al.length-i-1]!=9) nextlen=true;
		}
		System.out.println(sum);
		sum++;
		
		int[] next =null;
		if(!nextlen) {
			next = new int[al.length+1];
		} else {
		      next = new int[al.length];
		}
		
		for(int i=0;i <next.length;++i) {
			next[next.length-i-1]=sum%10;
			sum=sum/10;
		}
	    
		return next;
		
		
	}

}

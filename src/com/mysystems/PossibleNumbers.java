package com.mysystems;

import java.util.ArrayList;
import java.util.Scanner;

public class PossibleNumbers {
	public static void permute(int[] arr, int n){
	    permuteHelper(arr, 0,n);
	}

	private static void permuteHelper(int[] arr, int index, int n){
		int sum=0;
		StringBuilder sb = new StringBuilder();
	    if(index >= arr.length - 1){ 
	       
	        for(int i = 0; i < arr.length - 1; i++){
	              sum =sum+ arr[i]*(int)Math.pow(10,arr.length-1-i);
	        	        }
	        if(arr.length > 0) {
	        	sb.append(arr[arr.length - 1]);
	        	sum =sum+arr[arr.length - 1];
	        }

	        if(sum<n) {
	        System.out.println(sum);
	        }
	     
	        return;
	    }

	    for(int i = index; i < arr.length; i++){ //For each index in the sub array arr[index...end]

	        //Swap the elements at indices index and i
	        int t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;

	        //Recurse on the sub array arr[index+1...end]
	        permuteHelper(arr, index+1,n);

	        //Swap the elements back
	        t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;
	    }
	}

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int m1=sn.nextInt();
		int[] ar = new int[m1];
		for(int i=0;i<m1;++i) {
			ar[i]=sn.nextInt();
		}
		PossibleNumbers
         .permute(ar,n);

	}

}

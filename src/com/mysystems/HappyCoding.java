package com.mysystems;

import java.util.Scanner;

public class HappyCoding {
	void printHappyCoding(){
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int m1=sn.nextInt();
		int m2=sn.nextInt();
		int happy=0;
		int coding=0;
		int happycoding=0;
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<=n;++i) {
			if(i%m1==0 && i%m2==0) {
				sb.append(" happycoding ");
				sb.append(i);
				happycoding++;
				continue;
			}
			if(i%m1==0) {
				sb.append(" happy ");
				sb.append(i);
				happy++;
				continue;
			}
			if(i%m2==0) {
				sb.append(" coding ");
				sb.append(i);
				coding++;
				continue;
			}
		}
		
		System.out.println(sb.toString().trim());
		System.out.println("happy-"+happy);
		System.out.println("coding-"+coding);
		System.out.println("happycoding-"+happycoding);
		
	}
	
	public static void main(String[] args) {
		HappyCoding hc = new HappyCoding();
		hc.printHappyCoding();
	}

}

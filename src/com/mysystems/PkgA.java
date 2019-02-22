package com.mysystems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PkgA implements Comparable<PkgA> {
private Integer aa;
protected Integer ab;
Object Ob;
public Integer bc;
protected Integer cd;

List ls = new ArrayList();


 protected void  fAOne(){
	 HashMap map1 = new HashMap();
	// map1.ab=10;
aa=30;
Ob = "Hi";
boolean flag = Ob instanceof String;
System.out.println("flag "+flag);
}

public void fATwo(){
	System.out.println("In PkgA");
}
public static void main(String[] args){
	
	PkgA pkgA = new PkgA();
	pkgA.fAOne();
	
	
}

@Override
public int compareTo(PkgA o) {
	// TODO Auto-generated method stub
	return this.aa.compareTo(o.aa);
}



}

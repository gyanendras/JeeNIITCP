package com.mysystems.db;



import com.mysystems.PkgA;

public class PkgB extends PkgA{
	String st="Hi";
	Integer inti=10;
	
	void fAO(){
		PkgA pckA = new PkgA();
		cd=10;	
		bc =20;
		pckA.bc=25;
		ab=10;
		fAOne();
		
	}
	
	@Override
	protected void fAOne(){
	System.out.println("I am in class PkgB");
	}
	
	public void fATwo(){
		System.out.println("In PkgA");
	}
	
	public static void main(String[] args){
		
		PkgA pkgA = new PkgB();
		PkgB pkgB = new PkgB();
		pkgA.fATwo();
		pkgB.fATwo();
		pkgB.fAOne();
		
		
		
		
	}

}

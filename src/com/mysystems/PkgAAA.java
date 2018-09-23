package com.mysystems;

public class PkgAAA extends PkgA{
@Override
protected void fAOne(){
	PkgA pckA = new PkgA();
	pckA.ab=10;	
	ab=10;
	bc=20;
	pckA.bc = 30;
}
}

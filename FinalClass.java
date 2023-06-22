package com.ob.demo;

final class FinalClass1 {
	final static int Pi =10;
	
}

public class FinalClass{
	public static void main(String[] args) {
		FinalClass1 finalclass = new FinalClass1();
//		finalclass.Pi=35; Error 
		System.out.println(finalclass.Pi);
		
	}
}

package com.ob.demo;

public class TestGarbageCollector{
	 public void finalize()
	{
	System.out.println("object is garbage collected");
	}
	 public static void main(String args[])
	{
	  TestGarbageCollector gc1=new TestGarbageCollector();
	  TestGarbageCollector gc2=new TestGarbageCollector();
	  TestGarbageCollector gc3=new TestGarbageCollector();
	  
	  gc1=null;
	  gc2=null;
	  gc3=null;
	  System.gc();
	 }
	}
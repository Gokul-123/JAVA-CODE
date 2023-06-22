package com.ob.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WithoutMultithread {
     public static void main(String[] args) throws FileNotFoundException {
    	 long start = System.nanoTime();
    	 Scanner sc = new Scanner(new File("/home/gokul/Downloads/people-1000.csv"));  
    	 sc.useDelimiter(",");  
    	 while (sc.hasNext())  
    	 {  
    	 System.out.print(" "+sc.next());  
    	 }   
    	 sc.close(); 
    	 
    	long end=System.nanoTime();
    	System.out.println((double)TimeUnit.SECONDS.convert(end-start, TimeUnit.NANOSECONDS) +"second");
	}
}

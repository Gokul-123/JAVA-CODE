package com.ob.demo;


public class StaticClass {
    private static int a=10;


  
    public static void main(String[] args) {
        StaticClass.NestedStaticClass obj = new StaticClass.NestedStaticClass();
        obj.add();
    }
    
    
    public static class NestedStaticClass {
        private static int insideclassvar =20;
        public void add() {
        	System.out.println("Addition"+a+insideclassvar);
        }
    }

}

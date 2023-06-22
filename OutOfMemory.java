package com.ob.demo;

public class OutOfMemory{
    public static void main(String[] args) {
        try {
            while (true) {
                StringBuffer str = new StringBuffer("object Created");
            }

        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory Error.");
        }
    }
}

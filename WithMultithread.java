package com.ob.demo;
import java.io.*;
import java.util.concurrent.TimeUnit;

class CSVOps implements Runnable
{
    BufferedReader CSVBufferedReader;

    public CSVOps(){} // Default constructor

    public CSVOps(BufferedReader br){
        this.CSVBufferedReader = br;
    }

    private synchronized void readCSV(){
        System.out.println("Current thread "+Thread.currentThread().getName());
        String line;
        try {
            while((line = CSVBufferedReader.readLine()) != null){
                System.out.println(line);
              
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        readCSV();
    }

}



public class WithMultithread
{
    public static void main(String [] args) throws InterruptedException, FileNotFoundException
    {
    	 long start = System.nanoTime();
        String pathToCSV = "//home//gokul//Downloads//people-1000.csv";
        FileReader is = new FileReader(pathToCSV);
        BufferedReader br = new BufferedReader(is);
        CSVOps ops = new CSVOps(br);

        Thread t1 = new Thread(ops);
        t1.setName("T1");
        t1.start();
        Thread t2 = new Thread(ops);
        t2.setName("T2");
        t2.start();
        Thread t3 = new Thread(ops);
        t3.setName("T3");
        t3.start();
        t3.join();
        long end = System.nanoTime();
        System.out.println((double)TimeUnit.SECONDS.convert(end-start, TimeUnit.NANOSECONDS) +"second");
    }
}
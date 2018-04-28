package com.wafihasan.test;
//Multithreading example
public class Multithreading extends Thread //Extending Java's inbuilt Thread class
{
    @Override //Ignore this line. This just says that run method is being overridden here
    public void run() //Run method, in which a new thread is made and run
    {
        for (int i = 0; i < 10; i++) //Dummy for loop, to demonstrate multithreading
            System.out.println("ABC");
    }
    public static void main(String[] a)
    {
        Multithreading m = new Multithreading(); //Creating object of this class, to access run and start method
        m.start(); //Using object to access start method, which starts a new thread with the run method

        for (int i = 0; i < 10; i++) //Dummy for loop, to demonstrate multithreading
            System.out.println("XYZ");
    }
}

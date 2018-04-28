package com.wafihasan.test;
//Example of function overloading (a part of polymorphism)
public class Overloading
{
    public void add(int a, int b) //add method with integer parameters
    {
        System.out.println(a+b);
    }
    public void add(float a, float b) //add method with float parameters
    {
        System.out.println(a+b);
    }
    public void add(double a, double b) //add method with double parameters
    {
        System.out.println(a+b);
    }
    public static void main(String[] a)
    {
        Overloading obj = new Overloading(); //creating object
        obj.add(1.0, 7.6); //calling double waala method by passing double arguments
        obj.add(2,3); //calling integer waala method by passing integer arguments
        obj.add(2.3f, 4.5f); //calling float waala method by passing float arguments
    }
}

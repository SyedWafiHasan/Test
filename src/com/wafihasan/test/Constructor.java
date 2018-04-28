package com.wafihasan.test;

public class Constructor //Here Constructor overloading is also being done
{
    Constructor() //This is a default constructor. Accessed when constructor1 object is created
    {
        System.out.println("Default Constructor Accessed");
    }

    Constructor(int a, int b)//This is a parameterized constructor. Accessed when constructor2 object is created
    {
        System.out.println("Parameterized Constructor Accessed");
    }
    public static void main(String[] args)
    {
        Constructor constructor1 = new Constructor(); //Default constructor called
        Constructor constructor2 = new Constructor(2,3); //Parameterized constructor called
    }
}
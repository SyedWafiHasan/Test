package com.wafihasan.test; //Ignore this line
//Example of class inheritance
public class Inheritance //Base class - the one which will be inherited
{
    public void add(int a, int b) //Dummy method
    {
        System.out.println(a+b);
    }
    public void subtract(int x, int y) //Dummy method
    {
        System.out.println(x-y);
    }
}
class c extends Inheritance //Derived class - the one which will inherit base class
{
    public static void multiply(int a, int b)
    {
        System.out.println(a*b);
    }
}

class b extends c //Multi level inheritance
{
    public static void main(String[] args)
    {
        c obj = new c();
        c.multiply(3,4);
            Inheritance i = new Inheritance(); //creating object of derived class
            i.add(2,3); //calling methods with the help of object and passing required arguments
            i.subtract(10,7); //calling methods with the help of object and passing required arguments
    }
}


package com.wafihasan.test;

public class Interfaces implements Interface //Interface are inherited by the 'implements' keyword
{
    public static void main(String[] a)
    {
        Interfaces i = new Interfaces();
        i.add();
        i.subtract();
    }

    @Override //Ignore any and all @Override
    public void add()
    {
        System.out.println(10-7);
    }

    @Override
    public void subtract()
    {
        System.out.println(10+7);
    }

}

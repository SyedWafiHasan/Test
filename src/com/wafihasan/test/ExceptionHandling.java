package com.wafihasan.test;

public class ExceptionHandling
{
    public static void main(String[] a) throws Exception
    {
        try
        {
            throw new RuntimeException("Abc");
        }
        catch (ArithmeticException g)
        {
            System.out.println(g);
        }
        catch (RuntimeException e)
        {
            System.out.println("Runtime exception caught");
        }
        finally
        {
            System.out.println("Error handled");
        }
        throw new Exception("Zabardasti ka exception");
    }
}

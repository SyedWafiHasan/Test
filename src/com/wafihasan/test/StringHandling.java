package com.wafihasan.test;
import java.util.Scanner;
public class StringHandling //Working with strings in Java
{
    public static void main(String[] a)
    {
        Scanner scan = new Scanner(System.in);
        String s1 = "Hello", s2 = "Java"; //Tareeqa #1 of declaring strings
        String s3 = new String("Hello"); //Tareeqa #2
        char[] st = {'h','e','l','l','o'}; //Tareeqa
        String s4 = new String(st);        //#3
        String s5 = scan.next(); //Tareeqa #4 - reads only till a space is encountered
        String s6 = scan.nextLine(); //Tareeqa #5 - reads the complete line
        //Some important string functions are :
        System.out.println(s1.length()); //Returns length of string
        System.out.println(s2.charAt(3)); //Returns the character at the given index - 'a' in this case
        System.out.println(s1.concat(s2)); //Returns concatenated string - HelloJava in this case
        System.out.println(s3.equalsIgnoreCase(s4)); //Returns true, because hello = Hello if you ignore case
        System.out.println(s3.equals(s4)); //Returns false, because hello != Hello
        System.out.println(s1.substring(1,4)); //Returns 'ell' - start index is inclusive but end index is not
        System.out.println(s1.replace('e', 'a')); //Returns Hallo (Cue Sangam Mishra)
        System.out.println(s1.toLowerCase()); //Returns hello
        System.out.println(s1.toUpperCase()); //Returns HELLO
        System.out.println(s1.startsWith("He")); //Returns true, as Hello starts with He
        System.out.println(s1.endsWith("xyz")); //Returns false, as Hello does not end with xyz
        System.out.println(s1.contains("ell")); //Returns true, as Hello does contain 'ell'
    }
}

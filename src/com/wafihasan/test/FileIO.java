package com.wafihasan.test;

import java.io.*;
import java.nio.file.*;

public class FileIO
{
    public static void main(String[] a) throws Exception
    {
        File f = new File("/media/wafi/Wafi/Programs/Java Programs/Test/src/com/wafihasan/test","abc.txt");
        String s = "Random Shit";
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.canExecute());
        System.out.println(f.exists());
        System.out.println(f.getPath());
        System.out.println(f.length());
        //f.delete();
    }
}

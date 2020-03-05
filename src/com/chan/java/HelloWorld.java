package com.chan.java;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {
    public static final int INT_NUM = 10;
    private int num;
    public static void main(String[] args) {
        System.out.println("hello world");
        ArrayList arrayList = new ArrayList();
        //region Description
        if (arrayList == null && arrayList == null) {

        }
        //endregion
        
        Date date1 = new Date();
        Date date = new Date();

        arrayList.add(1, "123");
        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws FileNotFoundException {

        FileInputStream is = new FileInputStream("123.txt");
    }

    public void meathod(int a, int b) {
        num = 10;
    }

    public void test() {
    }
}

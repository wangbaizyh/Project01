package com.geek.java;

/**
 * @author G.E.E.K.
 * @create 2021-07-05 17:22
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * 快捷键的使用：
 */
public class HelloWorld {

    private int num;

    public HelloWorld() {
    }

    public static void main(String[] args) {
        getList();

    }

    public static void getList() {
        //region Description
        System.out.println("helloworld!!");
        System.out.println("helloworld!!");
        ArrayList list = null;
        //endregion

        list.add(0,123);
    }

    public static void method() {

        int num = 10;

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

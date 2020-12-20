package com.jt.learn.classloader.loading;

import java.sql.SQLOutput;

/**
 * <p>Title: Test_2 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/12/19 16:49 </p>
 *
 * @author: jt-ape
 */
public class Test_2 {
    public static void main(String[] args) {
        System.out.println(Test_2_B.str);
    }
}


class Test_2_A {
    static {
        System.out.println("A static Block");
    }
}

class Test_2_B extends Test_2_A{
    public static String str = "B str";

    static {
        System.out.println("B static Block");
    }
}
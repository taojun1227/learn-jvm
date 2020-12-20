package com.jt.learn.classloader.loading;

/**
 * <p>Title: Test_4 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/12/19 17:02 </p>
 *
 * @author: jt-ape
 */
public class Test_4 {
    public static void main(String[] args) {
        System.out.println(Test_4_A.str);
    }
}

class Test_4_A {
    public final static String str = "A str";

    static {
        System.out.println("A static Block");
    }
}

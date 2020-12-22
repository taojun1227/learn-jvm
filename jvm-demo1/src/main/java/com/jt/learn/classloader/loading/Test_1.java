package com.jt.learn.classloader.loading;

/**
 * <p>Title: Test_1 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/12/19 16:37 </p>
 *
 * @author: jt-ape
 */
public class Test_1 {

    public static void main(String[] args) {
        System.out.println(Test_1_B.str);
        Test_1_B.parentStaticMethod();

    }

}

class Test_1_A {
    public static String str= "A str";

    public Test_1_A () {
        System.out.println("A construct");
    }

    {
        System.out.println("A Block");
    }

    static{
        System.out.println("A static Block");
    }

    public static void parentStaticMethod() {
        System.out.println("A Static Method");
    }


}

class Test_1_B extends Test_1_A {
    static {
        System.out.println("B static Block");
    }
}

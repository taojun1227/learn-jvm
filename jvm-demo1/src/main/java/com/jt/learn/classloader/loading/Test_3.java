package com.jt.learn.classloader.loading;

/**
 * <p>Title: Test_3 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/12/19 16:57 </p>
 *
 * @author: jt-ape
 */
public class Test_3 {
    public static void main(String[] args) {
        Test_3_A[] array = new Test_3_A[1];
    }
}



class Test_3_A {
    static {
        System.out.println("A static Block");
    }
}

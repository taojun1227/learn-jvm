package com.jt.learn.classloader.loading;

import java.util.UUID;

/**
 * <p>Title: Test_5 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/12/19 17:10 </p>
 *
 * @author: jt-ape
 */
public class Test_5 {
    public static void main(String[] args) {
        System.out.println(Test_5_A.uuid);
    }
}

class Test_5_A {
    public final static String uuid = UUID.randomUUID().toString();

    static {
        System.out.println("A static Block");
    }
}

package com.jt.learn.bytecode;

/**
 * <p>Title: ByTeCodeTest1 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/27 15:42 </p>
 *
 * @author: jt-ape
 */
public class ByTeCodeTest1 {
    public static String str="abc";
    public int a = 1;

    public String demo(String name) {
        return name;
    }

    public static void main(String[] args) {
        ByTeCodeTest1 byTeCodeTest1 = new ByTeCodeTest1();
        int b = byTeCodeTest1.a;
    }

}

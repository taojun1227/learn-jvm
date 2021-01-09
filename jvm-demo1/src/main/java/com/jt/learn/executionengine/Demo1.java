package com.jt.learn.executionengine;

/**
 * <p>Title: com.jt.learn.executionengine.Demo1 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/1/9 21:58 </p>
 *
 * @author: jt-ape
 */
public class Demo1 {
    public static void main(String[] args) {
        Demo1_A demo1_a = new Demo1_A(1,2);
        System.out.println(demo1_a.a);
        System.out.println(demo1_a.b);

    }
}

class Demo1_A {
    public int a;
    public int b;
    public Demo1_A(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

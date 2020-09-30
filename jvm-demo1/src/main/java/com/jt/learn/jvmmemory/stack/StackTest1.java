package com.jt.learn.jvmmemory.stack;

/**
 * <p>Title: StackTest1 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/30 10:46 </p>
 *
 * @author: jt-ape
 */
public class StackTest1 {
    static int i =0;
    public static void demo() {


    }
    public static void main(String[] args) {
        i++;
        System.out.println(i);
        main(args);
    }
}

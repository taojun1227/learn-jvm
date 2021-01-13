package com.jt.learn.oop;

import org.openjdk.jol.info.ClassLayout;

/**
 * <p>Title: com.jt.learn.oop.OopTest6 </p>
 *
 * <p>Description:  new 一个8M的对象</p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/1/13 20:27 </p>
 *
 * @author: jt-ape
 */
public class OopTest6 {
    public static void main(String[] args) {
        int [] m8 = new int[2048-4];
        System.out.println(ClassLayout.parseInstance(m8).toPrintable());
    }
}

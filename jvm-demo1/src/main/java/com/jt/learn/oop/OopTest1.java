package com.jt.learn.oop;

import org.openjdk.jol.info.ClassLayout;

/**
 * <p>Title: OopTest1 </p>
 *
 * <p>Description:  输出对象大小</p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/30 17:26 </p>
 *
 * @author: jt-ape
 */
public class OopTest1 {
    public static void main(String[] args) {
        OopTest1 oop = new OopTest1();

        System.out.println(ClassLayout.parseInstance(oop).toPrintable());
    }
}

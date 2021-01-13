package com.jt.learn.oop;

import org.openjdk.jol.info.ClassLayout;

/**
 * <p>Title: com.jt.learn.oop.OopTest5 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/1/13 20:25 </p>
 *
 * @author: jt-ape
 */
public class OopTest5 {
    public static void main(String[] args) {
        Integer demo = new Integer(10);
        System.out.println(ClassLayout.parseInstance(demo).toPrintable());
    }
}

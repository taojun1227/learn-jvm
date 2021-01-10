package com.jt.learn.oop;

import org.openjdk.jol.info.ClassLayout;

/**
 * <p>Title: com.jt.learn.oop.OopTest4 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/1/9 23:37 </p>
 *
 * @author: jt-ape
 */
public class OopTest4 {
    public int a =1;
    public int b =2;
    public int c =3;
    public OopTest3 oopTest3 = new OopTest3();

    public static void main(String[] args) {
        OopTest4 oop = new OopTest4();

        System.out.println(ClassLayout.parseInstance(oop).toPrintable());
    }

}

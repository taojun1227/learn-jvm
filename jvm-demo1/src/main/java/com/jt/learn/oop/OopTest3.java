package com.jt.learn.oop;

import org.openjdk.jol.info.ClassLayout;

/**
 * <p>Title: com.jt.learn.oop.OopTest3 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/1/9 23:30 </p>
 *
 * @author: jt-ape
 */
public class OopTest3 {
    public int a =1;
    public int b =2;
    public int c =3;
    public static void main(String[] args) {
        OopTest3 oop = new OopTest3();

        System.out.println(ClassLayout.parseInstance(oop).toPrintable());
    }

}

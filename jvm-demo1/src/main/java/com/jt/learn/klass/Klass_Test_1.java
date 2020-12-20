package com.jt.learn.klass;

import java.util.AbstractCollection;

/**
 * <p>Title: Klass_Test1 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/12/18 10:47 </p>
 *
 * @author: jt-ape
 */
public class Klass_Test_1 {
    private Integer num;
    private String str;

    public Klass_Test_1(){}
    public Klass_Test_1(String str, Integer num) {
        this.str =str;
        this.num =num;
    }

    public static void main(String[] args) {
        new Class<Klass_Test_1>();
        Klass_Test_1 klass_test_1 = new Klass_Test_1("123", 12);
        int [] a = new int [10];
        Klass_Test_1[] b = new Klass_Test_1[10];
        Integer [] in = new Integer[1];
        float[] d = new float[1];
        System.out.println(d[0]);
        while(true);
    }
}

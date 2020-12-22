package com.jt.learn.klass;

import com.jt.learn.classloader.loading.Test_1;

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
    private Test_1 test_1;

    public Klass_Test_1(){}
    public Klass_Test_1(String str, Integer num, Test_1 test_1) {
        this.str =str;
        this.num =num;
        this.test_1 = test_1;
    }

    public static void main(String[] args) {
        Klass_Test_1 klass_test_1 = new Klass_Test_1("123", 12, new Test_1());
        int [] a = new int [10];
        Klass_Test_1[] b = new Klass_Test_1[10];
        Integer [] in = new Integer[1];
        float[] d = new float[1];
        System.out.println(d[0]);
        while(true);
    }
}

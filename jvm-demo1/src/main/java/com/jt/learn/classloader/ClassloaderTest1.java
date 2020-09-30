package com.jt.learn.classloader;

import com.jt.learn.classloader.loader.MyCLassloader1;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * <p>Title: Test_1 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/22 15:12 </p>
 *
 * @author: jt-ape
 */
public class ClassloaderTest1 {
    public static final int  a = 10;
    public static int b = 5;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Properties properties = System.getProperties();
//        for(Object obj : properties.keySet()) {
//            System.out.println(obj);
//
//        }
//        System.out.println(properties.getProperty("java.home"));
        MyCLassloader1 myCLassloader1 = new MyCLassloader1();
        myCLassloader1.loadClass("com.jt.learn.classloader.loader.MyCLassloaderTest");
        while (true);
    }
}

package com.jt.learn.classloader.loader;

/**
 * Created By ziya
 * 2020/9/24
 */
public class MyCLassloaderDemo {
    static {
        System.out.println("MyCLassloaderDemo");
    }

    public static void main(String[] args) {
        MyCLassloader1 myCLassloader1 = new MyCLassloader1();
        System.out.println(myCLassloader1.getParent());
    }
}

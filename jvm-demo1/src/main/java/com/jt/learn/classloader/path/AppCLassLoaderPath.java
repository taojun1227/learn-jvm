package com.jt.learn.classloader.path;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;

/**
 * Created By ziya
 * 2020/9/25
 */
public class AppCLassLoaderPath {
    public static void main(String[] args) {
        String[] split = System.getProperty("java.class.path").split(":");
//        Arrays.stream(split).forEach(System.out::println);
        System.out.println("=============");
        URLClassLoader systemClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        for (URL url : systemClassLoader.getURLs()) {
            System.out.println(url);
        }
    }
}

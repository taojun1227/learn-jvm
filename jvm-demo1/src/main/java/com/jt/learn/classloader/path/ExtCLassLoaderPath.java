package com.jt.learn.classloader.path;

import sun.misc.Launcher;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;

/**
 * Created By ziya
 * 2020/9/25
 */
public class ExtCLassLoaderPath {
    public static void main(String[] args) {
        String[] split = System.getProperty("java.ext.dirs").split(":");
//        Arrays.stream(split).forEach(System.out::println);

        URLClassLoader parent =  (URLClassLoader) ClassLoader.getSystemClassLoader().getParent();
        for(URL url : parent.getURLs()) {
            System.out.println(url);
        }
    }
}

package com.jt.learn.classloader.path;

import sun.misc.Launcher;

import java.net.URL;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created By ziya
 * 2020/9/25
 */
public class BootStrapCLassLoaderPath {

    public static void main(String[] args) {
        String[] property = System.getProperty("sun.boot.class.path").split(":");
//        property = property+":/home/ziya/Documents/openjdk/build/linux-x86_64-normal-server-slowdebug/jdk/lib/mmp.jar";
//        System.setProperty("sun.boot.class.path",property);
        Arrays.stream(property).forEach(System.out::println);
        System.out.println(property);
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
//        Stream.of(urLs).forEach(System.out::println);
    }
}

package com.jt.learn.jvmmemory;

import com.jt.learn.classloader.loader.MyCLassloader1;

/**
 * Created By ziya
 * 2020/9/28
 */
public class JvmMemoryTest1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            MyCLassloader1 m  = new MyCLassloader1();
            Class<?> aClass = m.loadClass("com.jt.learn.classloader.loader.MyCLassloaderTest");
            aClass.newInstance();

        }

    }
}

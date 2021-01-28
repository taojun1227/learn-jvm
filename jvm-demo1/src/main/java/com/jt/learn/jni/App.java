package com.jt.learn.jni;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * <p>Title: com.jt.learn.jni.App </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/1/28 19:00 </p>
 *
 * @author: jt-ape
 */
public class App {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.library.path"));
        System.loadLibrary("jni");

//        new JniDemo().callCppMethod();
    }
}

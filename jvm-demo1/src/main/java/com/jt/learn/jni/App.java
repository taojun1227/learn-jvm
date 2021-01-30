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
        // 打印加载动态链接库的目录
        System.out.println(System.getProperty("java.library.path"));
        // 加载动态链接库
        System.loadLibrary("com_jt_learn_jni_JniDemo");
        // 调用本地方法
        new JniDemo().callCppMethod();
    }
}

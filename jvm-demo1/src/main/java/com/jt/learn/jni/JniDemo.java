package com.jt.learn.jni;

/**
 * <p>Title: com.jt.learn.jni.JniDemo </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/1/28 12:44 </p>
 *
 * @author: jt-ape
 */
public class JniDemo {

    public native void callCppMethod();

    public void callJavaMethod() {
        System.out.println("hello JNI");
    }

}

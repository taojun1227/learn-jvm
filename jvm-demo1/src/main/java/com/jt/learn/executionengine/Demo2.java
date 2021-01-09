package com.jt.learn.executionengine;

/**
 * <p>Title: com.jt.learn.executionengine.Demo2 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/1/9 22:10 </p>
 *
 * @author: jt-ape
 */
public class Demo2 {
    public void test () {
        Demo2 demo2 = new Demo2();
        synchronized (demo2) {
            System.out.println("锁销除");
        }
    }
}

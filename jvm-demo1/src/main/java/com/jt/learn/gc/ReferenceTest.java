package com.jt.learn.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * <p>Title: com.jt.learn.gc.ReferenceTest </p>
 *
 * <p>Description:  强软弱虚引用</p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/1/12 9:46 </p>
 *
 * @author: jt-ape
 */
public class ReferenceTest {
    public static void main(String[] args) {
        // 强引用
        UserDemo userDemo = new UserDemo("强引用", 1);
        // 软引用
        SoftReference<UserDemo> softReference = new SoftReference<>(new UserDemo("软引用", 2));
        // 弱引用
        WeakReference<UserDemo> weakReference = new WeakReference<UserDemo>(new UserDemo("弱引用", 3));
        ReferenceQueue<UserDemo> userDemoReferenceQueue = new ReferenceQueue<>();
        PhantomReference<UserDemo> phantomReference = new PhantomReference<>(new UserDemo("虚引用", 4), userDemoReferenceQueue);

        System.gc();

        System.out.println("强引用："+userDemo);
        System.out.println("软引用："+softReference.get());
        System.out.println("弱引用："+weakReference.get());
        System.out.println("虚引用："+phantomReference.get()+"，队列："+userDemoReferenceQueue.poll());
        while(true);



    }
}

package com.jt.learn.system;

/**
 * <p>Title: com.jt.learn.system.Test1 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/3/2 9:01 </p>
 *
 * @author: jt-ape
 */
public class Test1 {
    static int num = 0;


    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num ++;
            System.out.println("thread:"+num);
        }).start();

        System.out.println("main:"+num);
        while(num == 0) System.out.println("loop:"+num);
    }
}

package com.jt.learn.logck;

/**
 * <p>Title: com.jt.learn.logck.DeadLockD恶魔 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/1/21 10:29 </p>
 *
 * @author: jt-ape
 */
public class DeadLockDemo {
    public static String lockA = "Lock A";
    public static String lockB = "Lock B";

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockA) {
                    System.out.println(Thread.currentThread().getName()+"获取到 Lock A 的锁");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"等待 Lock B 的锁。。。");
                    synchronized (lockB) {
                        System.out.println(Thread.currentThread().getName()+"获取到 Lock B 的锁");
                    }
                }
            }
        },"线程A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockB) {
                    System.out.println(Thread.currentThread().getName()+"获取到 Lock B 的锁");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"等待 Lock A 的锁。。。");
                    synchronized (lockA) {
                        System.out.println(Thread.currentThread().getName()+"获取到 Lock A 的锁");
                    }
                }
            }
        },"线程B").start();

    }
}

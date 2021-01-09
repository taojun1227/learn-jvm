package com.jt.learn.jvmmemory.stack;

/**
 * <p>Title: StackTest1 </p>
 *
 * <p>Description:  计算一个栈帧占多少个字节
 *  计算方法：设置栈帧大小除以栈深度
 * </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/30 10:46 </p>
 *
 * @author: jt-ape
 */
public class StackTest1 {
    static int i =0;
    public static void demo() {
        i++;
        System.out.println(i);
    }
    public static void main(String[] args) {
        // 11422 968
        i++;
        System.out.println(i);
        main(args);
    }
}

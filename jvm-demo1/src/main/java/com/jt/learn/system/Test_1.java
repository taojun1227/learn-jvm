package com.jt.learn.system;


/**
 * <p>Title: Test_1 </p>
 *
 * <p>Description:  进制相关</p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/12/23 10:27 </p>
 *
 * @author: jt-ape
 */
public class Test_1 {

    public static void main(String[] args) {
        // 八进制 64 + 16 +3
        System.out.println(0123);
        // 16进制 3*256+ 10*16 + 16
        System.out.println(0x3af);
        System.out.println(3*256+10*16+15);
        // 与运算
        System.out.println(1 & 2);
        // 或运算
        System.out.println(1 | 2);
    }
}

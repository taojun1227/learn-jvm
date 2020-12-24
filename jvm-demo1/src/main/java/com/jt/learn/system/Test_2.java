package com.jt.learn.system;

import java.math.BigInteger;

/**
 * <p>Title: com.jt.learn.system.Test_2 </p>
 *
 * <p>Description:  进制转换</p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/12/23 10:55 </p>
 *
 * @author: jt-ape
 */
public class Test_2 {

    public static void main(String[] args) {
        // 16进制转10进制
        System.out.println(new BigInteger("ffff", 16).intValue());

        // 10进制转16进制
        System.out.println(String.format("%08X", 65535));

        System.out.println("======================================");

        // 十进制转其它进制
        System.out.println(Integer.toBinaryString(18)); // 转二进制
        System.out.println(Integer.toOctalString(18)); // 转八进制
        System.out.println(Integer.toHexString(18)); // 转十六进制

        // 其它进制转十进制
        System.out.println(Integer.parseInt("10010", 2)); // 二进制转十进制
        System.out.println(Integer.parseInt("22", 8)); // 八进制转十进制
        System.out.println(Integer.parseInt("12", 16)); // 十六进制转十进制
    }
}

package com.jt.learn.string;

/**
 * <p>Title: StringTest1 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/28 10:04 </p>
 *
 * @author: jt-ape
 */
public class StringTest1 {
    public static void main(String[] args) {
//        String str = new String("abc");
//        str.hashCode();
//        char[] a = new char[] {'1','2'};
        final String str1 = new String("2");
        final String str2 = new String("2");

        String str = str1 + str2;
        String s = "22";
        System.out.println(str == s );

    }
}

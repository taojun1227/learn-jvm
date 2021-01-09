package com.jt.learn.string;

/**
 * <p>Title: com.jt.learn.string.StringTest4 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/1/9 17:32 </p>
 *
 * @author: jt-ape
 */
public class StringTest4 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String(new char[]{'a','b','c'});
        System.out.println(str1.hashCode() == str2.hashCode());
    }
}

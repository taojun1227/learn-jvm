package com.jt.learn.system;

/**
 * <p>Title: com.jt.learn.system.Test3 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/3/2 9:58 </p>
 *
 * @author: jt-ape
 */
public class Test3 {
    public static void main(String[] args) {
        int num [] = new int[]{10,15,18,1,19,6,2,5,11,2};
        quick(num,0,num.length-1);
        System.out.println(1);
    }
    static void  quick(int[] num, int left, int right) {
        int p ;
        if (left < right) {
            p  = sort(num, left, right);
            quick(num, left, p-1);
            quick(num, p+1, right);
        }
    }

    static int sort (int [] num, int left, int right) {
        int base = num [left];
        while (left < right) {
            while (left < right && num[right] > base) {
                right --;
            }
            if (left < right) {
                num[left++] = num[right];
            }
            while (left < right && num [left] < base) {
                left ++;
            }
            if (left < right) {
                num [right --] = num [left];
            }
        }
        num [left] = base;
        return left;
    }
}

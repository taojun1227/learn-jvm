package com.jt.learn.system;

/**
 * <p>Title: com.jt.learn.system.Test2 </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/3/2 9:45 </p>
 *
 * @author: jt-ape
 */
public class Test2 {
    public static void main(String[] args) {
        int num [] = new int[]{10,15,18,1,19,6,2,5,11,2};
        quicksort(num,0,num.length-1);
    }
    static void quicksort(int n[], int left, int right) {
        int dp;
        if (left < right) {
            dp = partition(n, left, right);
            quicksort(n, left, dp - 1);
            quicksort(n, dp + 1, right);
        }
    }

    static int partition(int n[], int left, int right) {
        int pivot = n[left];
        while (left < right) {
            while (left < right && n[right] >= pivot)
                right--;
            if (left < right)
                n[left++] = n[right];
            while (left < right && n[left] <= pivot)
                left++;
            if (left < right)
                n[right--] = n[left];
        }
        n[left] = pivot;
        return left;
    }
}

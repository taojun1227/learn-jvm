package com.jt.learn.executionengine;

/**
 * <p>Title: AllocationOnStack </p>
 *
 * <p>Description:  栈上分配例子</p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/29 17:35 </p>
 *
 * @author: jt-ape
 */
public class AllocationOnStack {

    public static AllocationOnStack allocation() {

        return new AllocationOnStack();
    }

    //-Xmx100m -Xms100m -XX:-DoEscapeAnalysis -XX:+PrintGC 关闭逃逸分析
    // 逃逸分析默认开启
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            allocation();
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-begin)+"ms");
        while (true);
    }
}

package com.jt.learn.gc.oom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>Title: com.jt.learn.gc.oom.HeapOverFlowTest </p>
 *
 * <p>Description:  堆溢出</p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/1/13 21:31 </p>
 *
 * @author: jt-ape
 */
public class HeapOverFlowTest {
    int [] intArr = new int[10];
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.getProperty("mm.mm"));
       Arrays.stream(args).forEach(m-> System.out.println(m));
        List<HeapOverFlowTest> list = new ArrayList<>();

        for(;;) {
            Thread.sleep(1);
            list.add(new HeapOverFlowTest());
        }
    }
}

package com.jt.learn.gc.oom;

/**
 * <p>Title: com.jt.learn.gc.oom.StackOverFlowTest </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/1/13 22:55 </p>
 *
 * @author: jt-ape
 */
public class StackOverFlowTest {
    private int i =0;
    public void test() {
        i++;
        test();
    }
    public static void main(String[] args) {
        StackOverFlowTest stackOverFlowTest = new StackOverFlowTest();
        try {
            stackOverFlowTest.test();
        }catch (Throwable e) {
            e.printStackTrace();
            System.out.println(stackOverFlowTest.i);
        }
    }
}

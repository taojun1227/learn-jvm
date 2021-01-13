package com.jt.learn.gc.oom;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <p>Title: com.jt.learn.gc.oom.MetaspaceOverFlowTest </p>
 *
 * <p>Description:  元空间溢出</p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/1/13 20:23 </p>
 *
 * @author: jt-ape
 */
public class MetaspaceOverFlowTest {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            Thread.sleep(40);
            Enhancer enhancer = new Enhancer();
            enhancer.setUseCache(false);
            enhancer.setSuperclass(MetaspaceOverFlowTest.class);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invokeSuper(o, objects);
                }
            })  ;
            Object o = enhancer.create();
//            System.out.println(o);
        }

    }
}

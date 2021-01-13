package com.jt.learn.gc;

import java.security.KeyStore;

/**
 * <p>Title: com.jt.learn.gc.User </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2021/1/12 9:47 </p>
 *
 * @author: jt-ape
 */
public class UserDemo {
    private String name;
    private int age;

    public UserDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

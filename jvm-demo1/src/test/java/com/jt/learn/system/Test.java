package com.jt.learn.system;

/**
 * <p>Title: Test </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/12/22 16:26 </p>
 *
 * @author: jt-ape
 */
public class Test {
    public static void main(String[] args) {
        User [] users = new User[] {
                new User("test1", 1),
                new User("test2", 2),
                new User("test3", 3),
                new User("test4", 4),
                new User("test5", 5)
        } ;
        User [] target = new User[users.length];
        System.arraycopy(users, 2, target, 0, target.length-2);

        for (int i=0; i<target.length; i++) {
            System.out.println(target[i]);
            if(target[i] != null) target[i].setName(target[i].getName()+target[i].getAge());

        }

        System.out.println("====================================");

        for (int i=0; i<users.length; i++) {
            System.out.println(users[i]);
        }
    }
}

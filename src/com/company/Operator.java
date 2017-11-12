package com.company;

//if the class is public, it should be declared in a file
//or remove public
/*public */class Tank {
    int level;
}

public class Operator {
    //Java别名机制
    public void test_assign_operator() {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 0;
        t2.level = 9;
        System.out.println("t1.level is " + t1.level);
        System.out.println("t2.level is " + t2.level);

        //t1和t2包含的时相同的引用，他们指向相同的对象
        //赋值操作后，t2引用被覆盖，原本指向的对象丢失，会被自动回收
        //如果想保持t1、t2是不同的引用，需使用下面的形式
        //t2.level = t1.level;
        t2 = t1;
        t2.level = 10;
        System.out.println("t1.level is " + t1.level);
        System.out.println("t2.level is " + t2.level);

        chang_tank(t1);
        System.out.println("t1.level is " + t1.level);
        System.out.println("t2.level is " + t2.level);
    }

    private void chang_tank(Tank t) {
        t.level = 100;
    }
}

package com.company;

class SubClass {
    SubClass() {
        System.out.println("SubClass init");
    }
}

class StaticSubClass {
    StaticSubClass() {
        System.out.println("StaticSubClass init");
    }

    void output() {
        System.out.println("StaticSubClass.output");
    }
}

public class ClassUsage {
    ClassUsage(boolean checkout) {
        checkedOut = checkout;
    }
    //构造函数调用构造函数，需要使用this关键字
    ClassUsage(int i) {
        this(i == 0);
    }
    void checkIn() {
        checkedOut = false;
    }

    void print_init_value() {
        System.out.println(cu);
        System.out.println(bool);
        System.out.println(c);
    }

    @Override
    protected void finalize() {
        if(checkedOut) {
            //super.finalize();
            System.out.println("Error: checked out");
        }
    }

    //成员的初始化，在构造函数前执行
    //指定初始化
    private boolean checkedOut = false;
    private SubClass sc = new SubClass();
    //未初始化，有默认值
    private ClassUsage cu;//null
    private boolean bool;//false
    private char c;//0
    private int i;
    //下面成员的初始化顺序取决于定义的顺序
    //int n1 = f(n2);//错误，Illegal forward reference，n2还没有初始化
    int n2 = g();
    private int g() { return 10; }
    private int f(int n) { return n;}

    ClassUsage() {
        i = 7;//i首先被初始化为0，然后再构造函数中设置为7
    }
    //static成员在非static成员前初始化
    static StaticSubClass ssc = new StaticSubClass();
    void print_static_subclass() {
        //System.out.println(ssc);
        //ssc.output();
    }

    int j;
    int k;
    {
        j = 1;
        k = 2;
    }
    static int e;
    static int f;
    static {
        e = 1;
        f = 2;
    }
}

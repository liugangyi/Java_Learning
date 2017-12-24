package com.company;

class BaseClass {
    public BaseClass() {
        System.out.println("BaseClass constructor");
        printJ();
    }

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }

    static int i = printInit("init BaseClass.i");
    int j = BaseClass.printInit("init BaseClass.j");

    public void printJ() {
        System.out.println("BaseClass.j is " + j);
    }
}

public class InitOrder extends BaseClass {
    public InitOrder() {
        System.out.println("InitOrder constructor");
    }

    public void printJ() {
        System.out.println("InitOrder.j is " + j);
    }

    static int i = printInit("init InitOrder.i");
    int j = BaseClass.printInit("init InitOrder.j");

    public static void main(String[] args) {
        System.out.println("start InitOrder.main");

        InitOrder initOrder = new InitOrder();

        //Java中，每个类的编译代码都存在于自己独立的class文件中，只有在第一次使用时才会被加载
        //即：第一次创建该类的对象，或者访问该类的static成员
        //初次加载class文件时，也是类的static成员初始化的时候
        //此时，所有static成员都会按照定义的顺序初始化


        //----------以下为输出结果------------
        //执行InitOrder的main函数，会去加载InitOrder的class文件，此时发现其有基类，会先加载基类文件

        //加载类时，将分配给类的存储空间清零，此时BaseClass.j和InitOrder.j的值都为0

        //加载基类BaseClass时，初始化其static成员：
        //init BaseClass.i

        //加载完基类，再加载InitOrder，初始化static成员
        //init InitOrder.i

        //开始执行main函数
        //start InitOrder.main

        //创建InitOrder类对象，会先调用基类的构造函数
        //调用基类构造函数前，会先初始化其成员变量
        //init BaseClass.j

        //初始化完成员变量，调用构造函数
        //BaseClass constructor

        //构造函数内多态，调用派生类的printJ函数，此时由于派生类的构造函数还没有执行，所以j为0
        //InitOrder.j is 0

        //调用InitOrder类构造函数前，会先初始化其成员变量
        //init InitOrder.j

        //初始化完成员变量，调用构造函数
        //InitOrder constructor
    }
}

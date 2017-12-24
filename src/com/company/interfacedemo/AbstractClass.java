package com.company.interfacedemo;

//如果一个类包含一个或多个抽象方法，这个类必须被定义成抽象类
abstract class BaseClass {
    private int i;
    public int getI() {
        return i;
    }

    public abstract void printI();
    public abstract void printName();
}

//派生类可以实现基类的部分抽象方法
abstract class SubClass extends BaseClass {
    @Override
    public void printI() {
        return;
    }
}

//派生类必须实现所有的抽象方法，才能被定义成非抽象类
public class AbstractClass extends SubClass {
    @Override
    public void printName() {
        System.out.println("a non abstract sub class must override all abstract method");
    }

    public static void main(String[] args) {
        //不允许创建抽象类对象
        //BaseClass baseClass = new SubClass();
        BaseClass baseClass = new AbstractClass();
    }
}

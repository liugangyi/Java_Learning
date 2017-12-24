package com.company;

class OverrideSub extends OverrideTest{
    public void public_func() {
        System.out.println("OverrideSub public_func");
    }
    protected void protected_func() {
        System.out.println("OverrideSub protected_func");
    }
    private void private_func() {
        System.out.println("OverrideSub private_func");
    }
    //final func not allowed override
//    public final void final_func() {
//        System.out.println("OverrideBase final_func");
//    }
    public static void static_func() {
        System.out.println("OverrideSub static_func");
    }

    //域无法覆盖，定义与基类相同的域，会存在两个不同的变量
    public int i = 11;
    public void printI() {
        System.out.println("OverrideSub: i is " + i);
        System.out.println("OverrideSub: super.i is " + super.i);
    }

    public OverrideSub() {
    }
}

public class OverrideTest {
    public void public_func() {
        System.out.println("OverrideTest public_func");
    }
    protected void protected_func() {
        System.out.println("OverrideTest protected_func");
    }
    private void private_func() {
        System.out.println("OverrideTest private_func");
    }
    public final void final_func() {
        System.out.println("OverrideTest final_func");
    }
    public static void static_func() {
        System.out.println("OverrideTest static_func");
    }

    public int i = 10;
    public void printI() {
        System.out.println("OverrideTest.i is " + i);
    }

    public OverrideTest() {
        //构造函数内多态，语法上允许，但是会出现变量未正确初始化的情况
        printI();
    }

    public static void main(String[] args) {
        OverrideTest overrideTest = new OverrideSub();
        overrideTest.public_func();
        overrideTest.protected_func();
        overrideTest.private_func();
        overrideTest.final_func();
        overrideTest.static_func();

        /*
        *
        * 以下内容伪输出
        * 基类的构造函数内调用printI()，产生多态行为，此时派生类的域未初始化
        * OverrideSub: i is 0
        * OverrideSub: super.i is 10
        *
        * public和protected函数，可以多态调用
        * OverrideSub public_func
        * OverrideSub protected_func
        *
        * private和final函数不能覆盖，private方法隐含是final的
        *
        * 派生类可以定义与基类相同的private函数，但不会产生多态行为
        * OverrideTest private_func
        * 派生类不能覆盖基类的final方法，所以派生类无static_func函数
        * OverrideTest final_func
        *
        * static方法与对象不关联，所以没有多态
        * OverrideTest static_func
        *
        * */
    }
}
package com.company.interfacedemo;

interface InterfaceFirst {
    //在接口内部只能定义抽象方法
    //public void donothing() {}

    //接口内部可以定义域，但隐含是static和final的
    public int i = 0;

    //接口中定义的方法，自动具有public访问权限
    void printName();

    //private方法必须有完整定义
    private void doNothing() { return; }

    //protected not allowed
    //protected void doNoth() {}
    //protected void doNoth();
}

interface canSpeak {
    void speak();
}

interface canSwim {
    void swim();
}

interface canRun {
    void run();
}

abstract class person {
    public abstract void printName();
}

//派生类只可以集成一个基类，但可以实现多个接口
class baby extends person implements canSpeak, canRun, canSwim {
    public void printName() {}
    public void speak() {}
    public void run() {}
    public void swim() {}
}

//use interface, not class
public class InterfaceDemo {
    public static void name(person p) {
        p.printName();
    }
    public static void speak(canSpeak cs) {
        cs.speak();
    }
    public static void run(canRun cr) {
        cr.run();
    }
    public static void swim(canSwim cs) {
        cs.swim();
    }

    public static void main(String[] args) {
        baby b = new baby();
        name(b);
        speak(b);
        run(b);
        swim(b);
    }
}

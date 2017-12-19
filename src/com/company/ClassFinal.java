package com.company;

//final修饰类时，表示不允许这个类继承被继承
final class Value {
    int value;
    public Value(int value) {
        this.value = value;
    }
}

public class ClassFinal {
    //final 作用于基本类型时，代表数值是恒定的编译期常量
    final int valueOne = 1;
    //既是static又是final的变量，占用一段不能改变的存储空间，通常用大写字母定义这样的变量
    static final int VALUE_TWO = 2;
    //final作用于对象引用时，代表这个引用不可改变，然而引用指向的对象可以改变
    //Java未提供使对象恒定不变的方法
    final Value valueThree = new Value(1);
    //空白final，必须在域的定义处或每个构造函数中对其进行初始化
    //提高了灵活性，可以让域根据对象而有所不同，同时又保留了恒定不变的特性
    final int valueFour;

    public ClassFinal() {
        valueFour = 1;
    }
    //final修饰方法时，禁止继承类对该方法的覆盖
    public final int getValue() {
        return valueFour;
    }

    public void testFinal() {
        //allow modify value
        valueThree.value = 2;
        //error, can't modify refrence
        //valueThree = new Value(3);
        //error, can't modify value
        //valueOne = 2;
    }
}

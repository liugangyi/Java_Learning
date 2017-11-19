package com.company;

import java.net.Inet4Address;

//if the class is public, it should be declared in a file
//or remove public
/*public */class Tank {
    int level;
}

class Operator {
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

    public void test_equals() {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println("Integer n1 = new Integer(47);");
        System.out.println("Integer n2 = new Integer(47);");
        //当对象使用 == 与 != 符号，比较的是引用，而非值
        //基本类型比较的时值
        System.out.println("n1 == n2 is " + (n1 == n2));
        System.out.println("n1 != n2 is " + (n1 != n2));
        //如果要对对象做值比较，需要使用equals方法
        System.out.println("n1.equals(n2) is " + n1.equals(n2));

        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = t2.level = 10;
        System.out.println("Tank t1 = new Tank();");
        System.out.println("Tank t2 = new Tank();");
        System.out.println("t1.level = t2.level = 10;");
        //类的equals方法，默认的行为是比较对象，除非在自己的新类中覆盖该方法
        System.out.println("t1.equals(t2) is " + t1.equals(t2));
    }

    public void test_direct_constent() {
        //十六进制
        int i1 = 0x2f;
        System.out.println("i1(0x2f): " + Integer.toBinaryString(i1));
        int i2 = 0X2F;
        System.out.println("i2(0X2F): " + Integer.toBinaryString(i2));
        //八进制，以0开头，后跟0~7的数字
        int i3 = 0177;
        System.out.println("i3(0177): " + Integer.toBinaryString(i3));
        //最大的char的十六进制表示
        char c = 0xffff;
        System.out.println("c(0xffff): " + Integer.toBinaryString(c));
        //最大的byte的十六进制表示，7位，7：111，f：1111
        byte b = 0x7f;
        System.out.println("b(0x7f): " + Integer.toBinaryString(b));
        long n1 = 200L;
        long n2 = 200l;
        float f1 = 1;
        float f2 = 1F;
        float f3 = 1f;
        double d1 = 1D;
        double d2 = 1d;
    }

    public void test_index_number() {
        //1.39 乘以 10 的负43 次方
        //最后的f可以用大写，也可以用小写
        //编译器通常将指数作为双精度（double）来处理，因此，最后的f或F时必须的，否则编译会报错
        float expFloat = 1.39e-43f;
        System.out.println(expFloat);
        //47 乘以 10 的 47 次方，即4.7 乘以 10 的 48 次方
        //指数默认时双精度，因此后面的d可以省略
        double expDouble = 47e47d;
        System.out.println(expDouble);
    }

    public void test_bit_operator() {
        int i1 = 0x101f;
        int i2 = 0x110f;
        System.out.println("i1 is " + Integer.toHexString(i1));
        System.out.println("i2 is " + Integer.toHexString(i2));
        System.out.println("i1 & i2 is " + Integer.toHexString((i1 & i2)));
        System.out.println("i1 | i2 is " + Integer.toHexString((i1 | i2)));
        //question:异或操作为啥是110，且没有f结尾
        System.out.println("i1 ^ i2 is " + Integer.toHexString((i1 ^ i2)));
        System.out.println("~ i1 is " + Integer.toHexString(~i1));
    }

    public void test_move_operator() {
        int i = -1;
        System.out.println("-1 is " + Integer.toBinaryString(i));
        //有符号右移，负数高位补1
        System.out.println("-1 >> 2 is " + Integer.toBinaryString(i >> 2) + ", " + Integer.toString(i >> 2));
        System.out.println("-1 >>> 2 is " + Integer.toBinaryString(i >>> 2) + ", " + Integer.toString(i >>> 2));

        i = 10;
        System.out.println("15 is " + Integer.toBinaryString(i));
        //有符号右移，正数高位补0
        System.out.println("15 >> 2 is " + Integer.toBinaryString(i >> 2) + ", " + Integer.toString(i >> 2));
        System.out.println("15 >>> 2 is " + Integer.toBinaryString(i >>> 2) + ", " + Integer.toString(i >>> 2));
        //支持以为赋值操作
        //i >>= 2;
        //i >>>= 2;
    }

    public void test_string_operator() {
        int x=0, y=1, z=2;
        String s = "x, y, z";
        //表达式以字符串开头，后面所有的操作数必须都是字符串
        System.out.println(s + x + y + z);
        System.out.println(s + (x + y + z));
        System.out.println(x + "");//convert x to string
        System.out.println("" + x);
    }

    public void test_cast_operator() {
        double above = 0.7;
        double below = 0.4;
        //浮点数向正数转换时，总是执行截尾，即舍弃小数位
        System.out.println("double above = 0.7, (int)above is " + (int)above);
        System.out.println("double below = 0.4, (int)below is " + (int)below);
        //如果需要如果需要四舍五入，需要使用Math.round函数
        System.out.println("double above = 0.7, Math.round(above) is " + Math.round(above));
        System.out.println("double below = 0.4, Math.round(below) is " + Math.round(below));
    }
}

package com.company;

import java.util.Random;

class Base {
    public void test_foreach() {
        Random rand = new Random(47);
        //float f[10];
        float f[] = new float[10];
        //下面的方法无法给数组初始化
        //初始化时，必须按索引访问元素
        //for(float x:f)
        //    x = rand.nextFloat();
        for(int i=0; i<10; ++i)
            f[i] = rand.nextFloat();
        //定义一个float类型变量x，继而将每一个元素的值赋给x
        //因此，不能使用foreach语句来初始化数组
        for(float x:f)
            System.out.println(x);
    }
}

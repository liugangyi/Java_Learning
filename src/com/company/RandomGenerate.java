package com.company;

import java.util.Random;

class RandomGenerate {
    public void test_random() {
        Random rand = new Random(47);
        System.out.println("rand int is " + rand.nextInt(25));
        System.out.println("rand float is " + rand.nextFloat());
        System.out.println("rand float is " + rand.nextLong());
    }
    public void math_random() {
        System.out.println(Math.random());
    }
}

package com.company;

import java.util.Random;

public class RandomGenerate {
    public void test_random() {
        Random rand = new Random(100);
        System.out.println("rand int is " + rand.nextInt(25));
        System.out.println("rand float is " + rand.nextFloat());
        System.out.println("rand float is " + rand.nextLong());
    }
}

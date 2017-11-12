package com.company;
import com.company.Container.*;
import com.company.Tank.*;
import com.company.RandomGenerate.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //test_container();
        //test_operator();
        test_random();
    }

    static void test_container() {
        Container container = new Container();
        container.output();
    }

    static void test_operator() {
        Operator op = new Operator();
        op.test_assign_operator();
    }

    static void test_random() {
        RandomGenerate rand = new RandomGenerate();
        rand.test_random();
    }
}

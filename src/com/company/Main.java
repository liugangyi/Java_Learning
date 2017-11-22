package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //test_container();
        //test_operator();
        //test_random();
        //test_base();
        test_class_usage();
    }

    static void test_container() {
        Container container = new Container();
        container.output();
    }

    static void test_operator() {
        Operator op = new Operator();
        op.test_assign_operator();
        op.test_equals();
        op.test_direct_constent();
        op.test_index_number();
        op.test_bit_operator();
        op.test_move_operator();
        op.test_string_operator();
        op.test_cast_operator();
    }

    static void test_random() {
        RandomGenerate rand = new RandomGenerate();
        rand.test_random();
    }

    static void test_base() {
        Base b = new Base();
        b.test_foreach();
    }

    static void test_class_usage() {
        //为什么是用下面两条语句，就不能打印出错误信息？
        //ClassUsage cls = new ClassUsage(true);
        //cls.checkIn();
        new ClassUsage().print_init_value();
        System.gc();
    }
}

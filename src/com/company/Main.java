package com.company;
import com.company.Container.*;
import com.company.Tank.*;
import com.company.RandomGenerate.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //test_container();
        //test_operator();
        //test_random();
        test_base();
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
}

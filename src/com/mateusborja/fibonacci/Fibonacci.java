/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
package com.mateusborja.fibonacci;

public class Fibonacci {

    public static int fibonacciSeq(int num) {

        if (num < 2) {

            return 1;
        }

        return fibonacciSeq(num - 1) + fibonacciSeq(num - 2);
    }

    public static void main(String[] args) {

        System.out.print("seq fibonacci = ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + fibonacciSeq(i));
        }

    }

}

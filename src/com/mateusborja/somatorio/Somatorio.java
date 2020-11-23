/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
package com.mateusborja.somatorio;

public class Somatorio {

    public static int somatorio(int num) {
        if (num == 0) {
            return 0;
        }
        return somatorio(num - 1) + num;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            System.out.println("somatorio de " + i + " e: " + somatorio(i));

        }

    }

}

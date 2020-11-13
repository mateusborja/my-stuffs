/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
package com.mateusborja.javarecursividade;

public class FatorialRecursivo {

    public static int fatorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * fatorial(num - 1);

    }

    static int fatorialR1;
    static int fatorialR2;
    static int fatorialR3;
    static int fatorialR4;

    public static void main(String[] args) {

        fatorialR1 = FatorialRecursivo.fatorial(10);
        fatorialR2 = FatorialRecursivo.fatorial(5);
        fatorialR3 = FatorialRecursivo.fatorial(3);
        fatorialR4 = FatorialRecursivo.fatorial(1);
        
        System.out.println(fatorialR1);
        System.out.println(fatorialR2);
        System.out.println(fatorialR3);
        System.out.println(fatorialR4);

        System.out.println("fatorial");
        int ct = 0;
        for (int i = 0; i < 10; i++) {
            ct++;
            System.out.println(ct + " fatorial = " + FatorialRecursivo.fatorial(i));

        }

    }

}

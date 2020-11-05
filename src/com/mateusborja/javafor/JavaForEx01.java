//java for
package com.mateusborja.javafor;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class JavaForEx01 {

    public static void main(String[] args) {

        int a = 2;

        for (;; a += a) {
            if (a > 5) {
                break;
            }
        }
        System.out.println(a);

        String[] names = {"Joao", "Maria", "Ledinha"};
        List lista = Arrays.asList(names);

        if (names.length >= 3) {
            System.out.println("Certo. Lista:  " + lista);
        } else {
            System.out.println("erro!");
        }

    }

}

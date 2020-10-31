package com.mateusborja.javaarraylist;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class ArrayList {

    public static void main(String[] args) throws Exception {

        String[] str = {"1", "2", "3"};
        List lista = Arrays.asList(str);

        System.out.println(lista);

        lista.set(2, "twoo");
        str[0] = "@wee";

        System.out.println(lista.get(0) + " " + str[2]);

        for (int i = 0; i < 3; i++) {
            System.out.println(lista);
        }

        //using try
        try {;

            String letter[] = new String[]{"A", "B", "C", "D"};

            List<String> list = Arrays.asList(letter);

            System.out.println("\nThe list is: " + list);

        } catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }

        Integer[] numerosDeUmADez = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List listaNumeros = Arrays.asList(numerosDeUmADez);
        System.out.println("\n " + "Lista de números => " + listaNumeros);

        listaNumeros.set(1, 21);

        System.out.println("\n" + "Index 1: "+ listaNumeros.get(1) + "\nLista => " + listaNumeros);

    }

}

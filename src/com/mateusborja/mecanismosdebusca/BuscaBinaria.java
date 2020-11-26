/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//busca em um array com indice 10, iteracao do array e print da colecao
package com.mateusborja.mecanismosdebusca;

import java.util.Scanner;

public class BuscaBinaria {

    static boolean buscarArray(int[] arr,
            int x) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        int x = 0;

        while (x < 10) {
            System.out.print("digite o n. " + (x + 1) + " numero: ");
            arr[x] = sc.nextInt();
            x++;

        }

        System.out.print("coleção: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("buscar por: ");
        int busca = sc.nextInt();
        boolean resultado = buscarArray(arr, busca);

        if (resultado) {
            System.out.println("Resultado da Busca: " + busca);
        } else {
            System.err.println("Não Encontrado!");
        }

        sc.close();

    }

}

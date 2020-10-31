//java array
package com.mateusborja.javaarray;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class ArrayBidimensional {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("qtde de linhas: ");
        int m = sc.nextInt();
        System.out.print("qtde de colunas: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("digite as linhas e colunas: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();

            }

        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");

            }

            System.out.println();

        }

        sc.close();

    }

}

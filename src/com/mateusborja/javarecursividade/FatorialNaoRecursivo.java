//java recursividade com fatorial n recursivo
package com.mateusborja.javarecursividade;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class FatorialNaoRecursivo {

    public static int fatorialNaoRecursivo(int num) {

        if (num == 0) {
            return 1;
        }

        int fatorial = 1;
        for (int i = num; i > 1; i--) {
            fatorial *= i;
        }

        return fatorial;
    }

    static int fatorialNR;

    public static void main(String[] args) {

        fatorialNR = FatorialNaoRecursivo.fatorialNaoRecursivo(10);

        System.out.println("Valor do fatorial de 10 =  " + fatorialNR);

    }

}

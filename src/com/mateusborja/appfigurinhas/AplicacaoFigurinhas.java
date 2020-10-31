// java methods and
package com.mateusborja.appfigurinhas;

/**
 *
 * @author mateus.borja
 */
public class AplicacaoFigurinhas {

    public static void main(String[] args) {

        Figurinhas p1 = new Figurinhas("Joao Honorio", 10);
        Figurinhas p2 = new Figurinhas("Leinha Honorio", 15);

        p1.recebeFigurinhas(15);
        p1.forneceFigurinhas(8, p2);

        p2.recebeFigurinhas(2);
        p2.forneceFigurinhas(1, p1);

        System.out.println(p1.toString() + "\n");
        System.out.println(p2.toString() + "\n");

    }

}

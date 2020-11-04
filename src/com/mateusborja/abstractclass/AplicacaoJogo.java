//java abstract class
package com.mateusborja.abstractclass;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class AplicacaoJogo {

    public static void main(String[] args) {

        Diamante d = new Diamante();
        d.pegar();

        Cogumelo c = new Cogumelo();
        c.pegar();

        Maca maca1 = new Maca();
        maca1.pegar();

        Moeda moeda = new Moeda();
        moeda.pegar();

        Item maca2 = new Maca(); // utilizando a classe abstrata para referenciar um objeto - variavel do tipo item referenciando o objeto v3 maca
        maca2.pegar();

    }

}

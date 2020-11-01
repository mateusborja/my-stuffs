//java polimorfismo
package com.mateusborja.javapolymorphism01;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Cerveja extends Bebida {

    public Cerveja() {
        super("Cerveja", false);
    }

    @Override
    public void preparar() {
        System.out.println("Pegando o Copo");
        System.out.println("Abrindo a " + getNomeBebida());
    }

}

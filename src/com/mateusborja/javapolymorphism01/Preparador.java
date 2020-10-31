//java polymorphism
package com.mateusborja.javapolymorphism01;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Preparador {

    public void prepararBebida(Bebida bebida) {
        System.out.println("Preparando => " + bebida.getNomeBebida());
        bebida.preparar();

        if (bebida.isAquecer()) {
            System.out.println("Esquentando => " + bebida.getNomeBebida());

        }
        System.out.println("Sua bebida => " + bebida.getNomeBebida() + " foi preparado com Sucesso! \n");

    }

}

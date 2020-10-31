//java polymorphism
package com.mateusborja.javapolymorphism01;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Bebida {

    private String nomeBebida;
    private boolean aquecer;

    Bebida(String name, boolean aquecer) {
        this.nomeBebida = name;
        this.aquecer = aquecer;
    }

    public String getNomeBebida() {
        return nomeBebida;
    }

    public boolean isAquecer() {
        return aquecer;
    }

    public void preparar() {
        System.out.println("...");

    }

}

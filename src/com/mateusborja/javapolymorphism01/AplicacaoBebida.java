//java polymorphism
package com.mateusborja.javapolymorphism01;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class AplicacaoBebida {

    public static void main(String[] args) {

        Preparador preparador = new Preparador();

        Leite leite = new Leite();
        preparador.prepararBebida(leite);

        Refrigerante refrigerante = new Refrigerante();
        preparador.prepararBebida(refrigerante);
        
        SucoNatural suconatural = new SucoNatural();
        preparador.prepararBebida(suconatural);
        
        AguaQuente aguaquente = new AguaQuente();
        preparador.prepararBebida(aguaquente);

    }

}

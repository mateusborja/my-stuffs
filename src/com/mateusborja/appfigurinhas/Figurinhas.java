//java method get and private method
package com.mateusborja.appfigurinhas;

/**
 *
 * @author mateus.borja
 */
public class Figurinhas {

    String nome;
    int numFigurinhas;

    Figurinhas(String nome,
            int numFigurinhas) {
        this.nome = nome;
        this.numFigurinhas = numFigurinhas;
    }

    public void recebeFigurinhas(int numFigurinhas) {
        this.numFigurinhas = numFigurinhas;
    }

    public void forneceFigurinhas(
            int numFigurinhas,
            Figurinhas pessoa) {
        this.numFigurinhas -= numFigurinhas;
        pessoa.numFigurinhas += numFigurinhas;

    }

    public String retornarNome(String nome) {
        return this.nome = nome;
    }

    public String toString() {
        return nome + " voce tem:  " + numFigurinhas + " figurinha(s).";
    }

}

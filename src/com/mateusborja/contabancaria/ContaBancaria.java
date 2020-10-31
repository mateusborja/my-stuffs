//java acess modifiers and methods get and set
package com.mateusborja.contabancaria;

/**
 *
 * @author mateus.borja
 */
public class ContaBancaria {

    private int numConta;
    private boolean contaAtiva;
    private double contaSaldo;

    /*
    Nao posso sacar um valor maior que meu
    saldo e nem menor que zero.
    adicionando if e a condicao
     */
    public void sacar(double valor) {
        if (valor < 0 && valor <= contaSaldo) {

            return;
        }

        contaSaldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <=0) {
            return;
        }
        contaSaldo += valor;
        
    }

    public int getNumConta() {
        return numConta;
    }

    public boolean isContaAtiva() {
        return contaAtiva;
    }

    public double getContaSaldo() {
        return contaSaldo;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setContaAtiva(boolean contaAtiva) {
        this.contaAtiva = contaAtiva;
    }

    //add rule not set saldo
    //public void setContaSaldo(double contaSaldo) {
    //  this.contaSaldo = contaSaldo;
    //}
}

/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
package com.mateusborja.javaoop02;

public abstract class Eletrodomestico {

    private static String nome;
    private int voltagem;
    private boolean ligado;
    
    public abstract void ligar();
    public abstract void desligar();
    
    
    public Eletrodomestico(int voltagem, boolean ligado) {
        setVoltagem(voltagem);
        setLigado(ligado);
    }
    

    public static String getNome() {
        return nome;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public boolean isLigado() {
        if (ligado) {
            return true;
        } else {
            return false;
        }
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    
    public void setLigado (boolean ligado) {
        this.ligado = ligado;
    }

}

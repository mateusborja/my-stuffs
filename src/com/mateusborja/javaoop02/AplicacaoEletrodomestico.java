/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
package com.mateusborja.javaoop02;

public class AplicacaoEletrodomestico {

    public static void main(String[] args) {

        Radio radio = new Radio();

        radio.ligar();
        radio.setNome("JovemPan");
        radio.setSintonia(89.4);
        radio.setVolume(63);
        radio.setFm("FM");
        System.out.println(radio.toString());

    }

}

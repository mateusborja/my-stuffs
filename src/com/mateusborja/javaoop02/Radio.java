/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
package com.mateusborja.javaoop02;

public class Radio extends Eletrodomestico {

    public static  String am;
    public static  String fm;
    private static double sintonia;
    private static double volume;

    public Radio() {
        super(100, true);

    }

    @Override
    public void ligar() {
        super.setLigado(true);
        System.out.println("Radio ligada!");

    }

    @Override
    public void desligar() {
        super.setLigado(false);
        System.out.println("Radio desligado!");

    }

    public double getSintonia() {
        return sintonia;
    }

    public double getVolume() {
        return volume;
    }

    public static void setSintonia(double sintonia) {
        Radio.sintonia = sintonia;
    }

    public static void setVolume(double volume) {
        Radio.volume = volume;
    }

    public static String getAM() {
        return am;
    }

    public static String getFM() {
        return fm;
    }

    public static void setAm(String am) {
        Radio.am = am;
    }

    public static void setFm(String fm) {
        Radio.fm = fm;
    }
    

    @Override
    public String toString() {
        return  "A radio: " + getNome() + " em sintonia  "+ getSintonia() + " " + getFM() +" e em alto e bom som " + getVolume() + "\n\t Seja bem vindo...";
    }

}

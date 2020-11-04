//java abstract class
package com.mateusborja.abstractclass;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public abstract class Item {

    private int posX;
    private int posY;

    public abstract void pegar(); //metodo abstrato, assinado apenas

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

}

/*heigth
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
package com.mateusborja.games;

import java.awt.Color;
import java.awt.Graphics;

public class Rect {

    private int x;
    private int y;
    private int width;
    private int heigth;
    private Color color;

    public Rect(int x,
            int y,
            int width,
            int heigth,
            Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, heigth);

    }

}

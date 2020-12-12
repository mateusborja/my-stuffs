/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
package com.mateusborja.games;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class GameWindow extends JFrame {

    private Rect background;
    private Rect rect;

    public GameWindow() {

        background = new Rect(0, 0, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT, Color.BLACK);
        rect = new Rect(150, 250, 15, 150, Color.WHITE);

        setTitle(Constants.WINDOW_TITLE);
        setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        background.paint(g);
        rect.paint(g);
        
    }
    
    

}

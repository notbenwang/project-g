package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.Graphics;

public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;
    private int x_delta=100, y_delta=100;
    public GamePanel() {
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void changeXDelta(int value){
        this.x_delta += value;
        repaint();
    }
    public void changeYDelta(int value){
        this.y_delta += value;
        repaint();
    }

    public void setRectPos(int x, int y) {
        this.x_delta = x;
        this.y_delta = y;
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(x_delta,y_delta,200,50);
    }

}

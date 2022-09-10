package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;

    private float x_delta=100, y_delta=100;
    private float x_dest=1, y_dest=1;
    private float xDir = 1f, yDir=1f;
    private int frames=0;
    private long lastCheck=0;

    private int WIDTH = 1600;
    private int HEIGHT = 1050;
    private Color RED = new Color(255,0,0);

    private long start = System.currentTimeMillis();
    private long time_in_air = 0;

    public GamePanel() {
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void changeXDelta(int value){

        this.x_delta += value;
    }
    public void changeYDelta(int value){

        this.y_delta += value;
    }

    public void SetXDest(int value) {
        this.x_dest = value;
    }
    public void SetYDest(int value) {
        this.y_dest = value;
    }

    public void setRectPos(int x, int y) {
        this.x_delta = x;
        this.y_delta = y;
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Black-ground
        g.setColor(Color.BLACK);
        g.fillRect(0,0,WIDTH,HEIGHT);

        // Moving boi
        updateRect();
        // Coloring boi
        g.setColor(RED);
        g.fillRect( (int) x_delta, (int) y_delta,200,50);

        

    }

    private void updateRect() {

        double xPos = x_dest, yPos = y_dest;
        int xSpeed = 1, ySpeed = 1;
        double angle = Math.atan(yPos/xPos);
        double gravity = 0.098/2;

        // gravity engine
        if ( (y_delta-25) < 900 ) {
            time_in_air = System.currentTimeMillis() - start;
            y_delta += (float) gravity * time_in_air;
            if (y_delta >=900){
                y_delta = 900;
                this.start = System.currentTimeMillis();
            }
        } else {
            this.start = System.currentTimeMillis();
        }


//
//        if (x_delta > WIDTH || x_delta < 0) {
//            xDir *= -1;
//        }
//        if (y_delta > HEIGHT || y_delta < 0) {
//            yDir *= -1;
//        }
    }


}

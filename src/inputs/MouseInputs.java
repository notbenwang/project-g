package inputs;

import main.GamePanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputs implements MouseListener, MouseMotionListener {
    private GamePanel gamePanel;
    private int xPos=0, yPos=0;
    public MouseInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("X: "+e.getX()+" Y: "+e.getY());
        gamePanel.setRectPos(e.getX()-100,e.getY()-25);
//        gamePanel.changeXDelta(e.getX() - 100);
//        gamePanel.changeYDelta(e.getY() - 25);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // gamePanel.setRectPos(e.getX()-100, e.getY()-25);
//        if (xPos != e.getX()-100 || yPos != e.getY()-25) {
//            gamePanel.changeXDelta(e.getX() - 100);
//            gamePanel.changeYDelta(e.getY() - 25);
//
//        }
    }
}

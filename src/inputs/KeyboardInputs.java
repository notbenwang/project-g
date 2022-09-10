package inputs;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
    private GamePanel gamePanel;
    private int player_speed = 100;
    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

        switch(e.getKeyCode()) {
            case KeyEvent.VK_W:
                gamePanel.changeYDelta(-player_speed*4);
                break;
            case KeyEvent.VK_A:
                gamePanel.changeXDelta(-player_speed);
                break;
//            case KeyEvent.VK_S:
//                gamePanel.changeYDelta();
//                break;
            case KeyEvent.VK_D:
                gamePanel.changeXDelta(player_speed);
                break;


        }
    }

}

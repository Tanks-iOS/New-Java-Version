/*
 * Baron Alloway and Ryan Tam
 * Tanks - Version 1.0
 * 2014
 */
package tanks;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Baron
 */
public class Tanks {

    /**
     * @param args the command line arguments
     */
    GamePanel myPanel = null;

    public static void main(String[] args) throws IOException {

        //running our resolution asker
        ResolutionAsker setResolution = new ResolutionAsker();
        JFrame mainFrame = new JFrame("Tanks");

        while (setResolution.done == false) {
            mainFrame.setSize(setResolution.getWidth(), setResolution.getHeight());
            mainFrame.setLocation(setResolution.getHorizCenter() - (int) (setResolution.getWidth() / 2), setResolution.getVertCenter() - (int) (setResolution.getHeight() / 2));
        }
        GamePanel myPanel = new GamePanel(setResolution.getPath());
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setContentPane(myPanel);
        myPanel.requestFocus();

        while (true) {
            if (myPanel.left && myPanel.myTank.getX() >= myPanel.boundary) {
                myPanel.myTank.moveLeft();

                if (myPanel.up) {
                    myPanel.myTank.setBearing(-Math.PI * 3 / 4);
                } else if (myPanel.down) {
                    myPanel.myTank.setBearing(+Math.PI * 3 / 4);
                } else {
                    myPanel.myTank.setBearing(Math.PI);
                }
            }
            if (myPanel.right && myPanel.myTank.getX() <= myPanel.fieldWidth - myPanel.boundary) {
                myPanel.myTank.moveRight();
                if (myPanel.up) {
                    myPanel.myTank.setBearing(-Math.PI * 1 / 4);
                } else if (myPanel.down) {
                    myPanel.myTank.setBearing(+Math.PI * 1 / 4);
                } else {
                    myPanel.myTank.setBearing(0);
                }
            }
            if (myPanel.up && myPanel.myTank.getY() > myPanel.boundary) {
                myPanel.myTank.moveUp();
                if (!myPanel.right && !myPanel.left) {
                    myPanel.myTank.setBearing(-Math.PI * 2 / 4);
                }
            }
            if (myPanel.down && myPanel.myTank.getY() <= myPanel.fieldHeight - myPanel.boundary) {
                myPanel.myTank.moveDown();
                if(!myPanel.right && !myPanel.left){
                    myPanel.myTank.setBearing(+Math.PI * 2 / 4);
                }
            }

            myPanel.myTank.setPosition(myPanel.myTank.getX(), myPanel.myTank.getY());

            if(myPanel.myTank.trigger){
            myPanel.activeBullets.add(new Bullet(myPanel.myTank.getX(), myPanel.myTank.getY(), myPanel.myTank.fireAngle));
            }
            myPanel.repaint();
            try {
                Thread.sleep(17);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tanks.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void gameLoop() {

    }

}

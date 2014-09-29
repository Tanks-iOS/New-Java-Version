/*
 * Baron Alloway and Ryan Tam
 * Tanks - Version 1.0
 * 2014
 */
package tanks;

import java.util.ArrayList;
import java.util.List;
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
    

    public static void main(String[] args) {

        //running our resolution asker
        ResolutionAsker setResolution = new ResolutionAsker();
        Game gameLoop = new Game();

        JFrame mainFrame = new JFrame("Tanks");
        
        while (setResolution.done == false) {
            mainFrame.setSize(setResolution.getWidth(), setResolution.getHeight());
            mainFrame.setLocation(setResolution.getHorizCenter() - (int) (setResolution.getWidth() / 2), setResolution.getVertCenter() - (int) (setResolution.getHeight() / 2));
        }

        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setResizable(true);
        mainFrame.setVisible(true);
        GamePanel myPanel = new GamePanel(setResolution.getWidth(),setResolution.getHeight()+30);
        myPanel.setSize(mainFrame.getWidth(), mainFrame.getHeight());
        mainFrame.setContentPane(myPanel);

        while (true) {
            myPanel.repaint();

            try {
                Thread.sleep(17);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tanks.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

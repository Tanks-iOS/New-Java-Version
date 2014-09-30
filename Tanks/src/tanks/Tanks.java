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
    GameInput myInput = new GameInput();
    Tank myTank = new Tank();
    
    
    public static void main(String[] args) throws IOException {

        //running our resolution asker
        ResolutionAsker setResolution = new ResolutionAsker();
        JFrame mainFrame = new JFrame("Tanks");
        
        while (setResolution.done == false) {
            mainFrame.setSize(setResolution.getWidth(), setResolution.getHeight());
            mainFrame.setLocation(setResolution.getHorizCenter() - (int) (setResolution.getWidth() / 2), setResolution.getVertCenter() - (int) (setResolution.getHeight() / 2));
        }
         GamePanel myPanel = new GamePanel(setResolution.getPath());
        
        mainFrame.setContentPane(myPanel);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setResizable(true);
        mainFrame.setVisible(true);
        myPanel.requestFocus();

        
        while (true) {
        myPanel.repaint();
        System.out.println("j");
            try {
                Thread.sleep(17);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tanks.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void gameLoop()
    {
        if(myInput.left){
        myTank.moveLeft();
        }
    }
    
}

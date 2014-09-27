/*
 * Baron Alloway and Ryan Tam
 * Tanks - Version 1.0
 * 2014
 */

package tanks;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

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
        
        JFrame mainFrame = new JFrame("Tanks");
        GamePanel myPanel = new GamePanel();
       while(setResolution.done == false)
       {
        mainFrame.setSize(setResolution.getWidth(), setResolution.getHeight());
           
        mainFrame.setLocation(setResolution.getHorizCenter() - (int)(setResolution.getWidth()/2), setResolution.getVertCenter() - (int)(setResolution.getHeight()/2));
        }
        mainFrame.setVisible(true);
       
        
       while(true)
       {
       myPanel.repaint();

            try {
                Thread.sleep(17);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tanks.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
       }
        
        
        
        
    }
    public int setCollision()
        {
            int distance = 4;
            int tank = 5;
            
            if(tank < distance)
            {
                System.out.println("HAHAHAHAHAHA");
            }
            return 2;
        }
    
}

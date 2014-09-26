/*
 * Baron Alloway and Ryan Tam
 * Tanks - Version 1.0
 * 2014
 */

package tanks;

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
        
       do
       {
        mainFrame.setSize(setResolution.getWidth(), setResolution.getHeight());
           
        mainFrame.setLocation(setResolution.getHorizCenter() - (int)(setResolution.getWidth()/2), setResolution.getVertCenter() - (int)(setResolution.getHeight()/2));
        }while(setResolution.done == false);
        mainFrame.setVisible(true);
       
        
        
        
        
        
        
    }
    
}

/*
 * Baron Alloway and Ryan Tam
 * Tanks - Version 1.0
 * 2014
 */

package tanks;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author Baron
 */
public class ResolutionAsker {
    private int width;
    private int height;
    String path;
    ResolutionAsker()
    {
    //open panel that will ask for resolution
    //4 types and return appropriate dimensions to main program
    //etc
        
        JFrame askerFrame = new JFrame();
        askerFrame.setVisible(true);
        askerFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        askerFrame.add(new JLabel("Select A Dimension Please:"));
        
        
        
    }
    
    public int getWidth()
    {
        return width;
    }
    public void setWidth(int newWidth)
    {
        width = newWidth;
    }
    public int getHeight()
    {
        return height;
    }
    public void setHeight(int newHeight)
    {
        height = newHeight;
    }        
    public String getPath()
    {
        return path;
    }
    
    
           
    
    
    
}

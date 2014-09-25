/*
 * Baron Alloway and Ryan Tam
 * Tanks - Version 1.0
 * 2014
 */

package tanks;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
        //creating the new frame to ask dimensions
        final JFrame askerFrame = new JFrame();
        //set the size to 400 by 300 (just to start not real dimensions yet)
        askerFrame.setSize(400,300);
        //program exits if hit close button
        askerFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //create a new panel for our content
        JPanel content = new JPanel();
        //set the size of our content to 400 by 300
        content.setSize(400,300);
        //set the content of the frame to be the content of the pane
        askerFrame.setContentPane(content);
        //make the content visible
        content.setVisible(true);
        //create button for 800 by 600
        JButton eightsix = new JButton("800 X 600");
        //create button for 1024 by 768
        JButton teneighty = new JButton("1024 X 768");
        //label to prompt for dimension
        JLabel prompt = new JLabel("Select A Dimension:");
        
        //add objects to the content screen
        content.add(prompt);
        content.add(eightsix);
        content.add(teneighty);
        //resize window to the size of only our components
        askerFrame.pack();
       
        //get the dimensions of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //move the window to the centre of the screen
        askerFrame.setLocation((int)dim.getWidth()/2 - (int)askerFrame.getWidth() / 2, (int)dim.getHeight()/2 - (int) askerFrame.getHeight()/2);
       //make the frame visible
        askerFrame.setVisible(true);
        
        
        eightsix.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                width = 800;
                height = 600;
                path = "eightsix";
                askerFrame.dispose();
            
            }
        });
        
        teneighty.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                width = 1024;
                height = 768;
                path = "tentwentyfour";
                askerFrame.dispose(); }
        });
        
        
        
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

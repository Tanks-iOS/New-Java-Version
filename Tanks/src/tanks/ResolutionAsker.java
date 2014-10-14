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
    private int width = 0;
    private int height = 0;
    String path;
    Dimension dim;
    boolean done=false;
   
    ResolutionAsker()
    {
        //creating the new frame to ask dimensions
        final JFrame askerFrame = new JFrame("SELECT RESOLUTION");
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
        JButton eightsix = new JButton("960 X 540");
        //create button for 1024 by 768
        JButton teneighty = new JButton("1920 X 1080");
        //create button for 2k
        JButton twok = new JButton ("2k");
        //label to prompt for dimension
        JLabel prompt = new JLabel("Select A Dimension:");
        
        //add objects to the content screen
        content.add(prompt);
        content.add(eightsix);
        content.add(teneighty);
        content.add(twok);
        //resize window to the size of only our components
        askerFrame.pack();
       
        //get the dimensions of the screen
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        //move the window to the centre of the screen
        askerFrame.setLocation((int)dim.getWidth()/2 - (int)askerFrame.getWidth() / 2, (int)dim.getHeight()/2 - (int) askerFrame.getHeight()/2);
       //make the frame visible
        askerFrame.setVisible(true);
        
        
        eightsix.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                width = 960;
                height = 540;
                path = "960X540";
                askerFrame.dispose();
                done = true;
            }
        });
        
        teneighty.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                width = 1920;
                height = 1080;
                path = "1920X1080";
                askerFrame.dispose();
            done = true;
            }
        });
        
        twok.addActionListener(new ActionListener(){

            
            public void actionPerformed(ActionEvent e) {
                width = 2880+6; //22 and 56 are compenstation factors cuz the border of the window covers a bt up
                height = 1620+40;
                path = "2k";
                askerFrame.dispose();
                done = true;
            }
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
    
    public int getHorizCenter()
    {
        return (int)(dim.getWidth()/2);
    }
    public int getVertCenter()
    {
        return (int)(dim.getHeight()/2);
    }
}

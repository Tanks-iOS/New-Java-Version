/*
 * Baron Alloway and Ryan Tam
 * Tanks - Version 1.0
 * 2014
 */
package tanks;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Baron
 */
public class GamePanel extends JPanel {

    //Game Setup

    int fieldWidth;
    int fieldHeight;

    //Images
    Image background;
    MediaTracker mediaTracker = new MediaTracker(this);

    GamePanel(String path) throws IOException {

        URL imgURL;
        String resourceFolder = "resources\\"+path+"\\";
        String imgPath;

        imgPath = (resourceFolder + "background.png");
        System.out.println(imgPath);
        imgURL = getClass().getResource(imgPath);
        background = Toolkit.getDefaultToolkit().getImage(imgURL);
        mediaTracker.addImage(background, 0);

        try {
            mediaTracker.waitForID(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                //store width and heigh of background
        fieldWidth = background.getWidth(this);
        fieldHeight = background.getHeight(this);


        //set it to visible
        setVisible(
                true);
        //get focouse
        setFocusable(
                true);
        requestFocus();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(background, 0, 0, this);
    }

}

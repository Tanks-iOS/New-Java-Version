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

    GamePanel(int x, int y) {

        fieldWidth=x;
        fieldHeight=y;
        URL imgURL;
        String resourceFolder = "resource\\";
        String imgPath;
        //fieldWidth = resolution.getWidth();
        //fieldHeight = resolution.getHeight();
        System.out.println(fieldWidth+fieldHeight);

        switch (fieldWidth) {
            case 2880:
                if (fieldHeight == 1620+30) {
                    resourceFolder = "resources\\2k\\";
                }
        }
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
    }

    public void paintComponent(Graphics g) {
        g.drawImage(background, 0, 0, this);
    }

}

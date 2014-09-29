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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Baron
 */
public class GamePanel extends JPanel implements KeyListener, MouseListener, MouseMotionListener{

    //Game Setup

    int fieldWidth;
    int fieldHeight;

    //Images
    Image background;
    Image tank;
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
        
        imgPath = (resourceFolder + "tankBase.png");
        System.out.println(imgPath);
        imgURL = getClass().getResource(imgPath);
        tank = Toolkit.getDefaultToolkit().getImage(imgURL);
        mediaTracker.addImage(tank, 0);

        try {
            mediaTracker.waitForID(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //store width and heigh of background
        fieldWidth = background.getWidth(this);
        fieldHeight = background.getHeight(this);

        //set it to visible
        setVisible(true);
        //get focouse
        setFocusable(true);
        requestFocus();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(background, 0, 0, this);
        g.drawImage(tank,0,0,this);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

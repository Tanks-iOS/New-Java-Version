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
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Baron
 */
//handles game graphics
public class GamePanel extends JPanel implements KeyListener, MouseListener, MouseMotionListener {

    //Game Setup
    int fieldWidth;
    int fieldHeight;
    int boundary = 200;
    //Images
    Image background;

    BufferedImage tank;
    BufferedImage rotatedTank;
    BufferedImage bullet;
    BufferedImage rotatedBullet;

    boolean left = false;
    boolean right = false;
    boolean up = false;
    boolean down = false;

    char keyPressed;

    Tank myTank = new Tank();
    ArrayList<Bullet> activeBullets = new ArrayList();

    Iterator bulletITR;

    MediaTracker mediaTracker = new MediaTracker(this);

    GamePanel(String path) throws IOException {

        URL imgURL;
        String resourceFolder = "resources\\" + path + "\\";
        String imgPath;

        imgPath = (resourceFolder + "background.png");
        System.out.println(imgPath);
        imgURL = getClass().getResource(imgPath);
        background = Toolkit.getDefaultToolkit().getImage(imgURL);
        mediaTracker.addImage(background, 0);

        imgPath = (resourceFolder + "tankBase.png");
        System.out.println(imgPath);
        imgURL = getClass().getResource(imgPath);
        tank = ImageIO.read(imgURL);
        mediaTracker.addImage(tank, 0);

        imgPath = (resourceFolder + "goldBulletBill.png");
        System.out.println(imgPath);
        imgURL = getClass().getResource(imgPath);
        bullet = ImageIO.read(imgURL);
        mediaTracker.addImage(tank, 0);

        try {
            mediaTracker.waitForID(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        //store width and heigh of background
        fieldWidth = background.getWidth(this);
        fieldHeight = background.getHeight(this);
        //add mouse and keyboard inputs
        addKeyListener(
                this);
        addMouseMotionListener(
                this);
        addMouseListener(
                this);

        //set the side of the panel to the background size
        setSize(fieldWidth, fieldHeight);

        //set it to visible
        setVisible(true);
        //get focouse
        setFocusable(true);
        requestFocus();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(background, 0, 0, this);

        AffineTransform tankRotate = new AffineTransform();
        tankRotate.rotate(myTank.getBearing(), (int) ((int) (tank.getWidth(this) + 1) / 2), (int) ((int) (tank.getHeight(this) + 1) / 2));
        AffineTransformOp tankRotated = new AffineTransformOp(tankRotate, AffineTransformOp.TYPE_BILINEAR);
        rotatedTank = tankRotated.filter(tank, null);
        g.drawImage(rotatedTank, (int) myTank.getX() - (tank.getWidth(this)) / 2, (int) myTank.getY() - (tank.getHeight(this)) / 2, this);

        bulletITR = activeBullets.iterator();
        while (bulletITR.hasNext()) {
            Bullet theBullet = (Bullet) bulletITR.next();
            AffineTransform bulletRotate = new AffineTransform();
            bulletRotate.rotate(theBullet.bulletAngle, (int) ((int) (bullet.getWidth(this) + 1) / 2), (int) ((int) (bullet.getHeight(this) + 1) / 2));
            AffineTransformOp bulletRotated = new AffineTransformOp(bulletRotate, AffineTransformOp.TYPE_BILINEAR);
            rotatedBullet = bulletRotated.filter(bullet, null);
            g.drawImage(rotatedBullet, (int) theBullet.bulletX - (bullet.getWidth(this)) / 2, (int) theBullet.bulletY - (bullet.getHeight(this)) / 2, this);
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        keyPressed = (ke.getKeyChar());
        switch (keyPressed) {
            case 'a':
                left = true;
                break;
            case 'd':
                right = true;
                break;
            case 'w':
                up = true;
                break;
            case 's':
                down = true;
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        keyPressed = (ke.getKeyChar());
        switch (keyPressed) {
            case 'a':
                left = false;
                break;
            case 'd':
                right = false;
                break;
            case 'w':
                up = false;
                break;
            case 's':
                down = false;
                break;
            default:
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        myTank.trigger = true;
        myTank.fireAngle = Math.atan2(me.getY() - myTank.getY(), me.getX() - myTank.getX());
        System.out.println("Mouse @:" + me.getX() + ", " + me.getY());
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

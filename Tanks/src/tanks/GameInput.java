/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;


/**
 *
 * @author Ryan
 */

//handles game inputs
public class GameInput implements KeyListener, MouseListener, MouseMotionListener{
    
    char keyPressed;

    boolean left=false;
    boolean right=false;
    boolean up=false;
    boolean down=false;
    
    GameInput(){
    }
    public boolean left(){
    return left;
    }
    public boolean right(){
    return right;
    }
    public boolean up(){
    return up;
    }
    public boolean down(){
    return down;
    }


    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanks;

/**
 *
 * @author Ryan
 */
public class Bullet {
    double bulletX;
    double bulletY;
    double bulletAngle;
    double bulletSpeed=10;
    
    Bullet(double x, double y, double angle){
        bulletX = x;
        bulletY = y;
        bulletAngle =angle;
    
    }
}

/*
 * Baron Alloway and Ryan Tam
 * Tanks - Version 1.0
 * 2014
 */

package tanks;

/**
 *
 * @author Baron
 */
public class Tank {
    int lives = 3;
    
    double tankX;
    double tankY;
    double speed=2;
    
    boolean moveLeft=false;
    boolean moveRight=false;
    boolean moveUp=false;
    boolean moveDown=false;
    
    boolean hitLeft=false;
    boolean hitRight=false;
    boolean hitUp=false;
    boolean hitDown=false;
    
    int bulletMag=6;
    int amo=bulletMag;
    long reloadTime =600000000;
    long triggerSpeed=300000000;
    boolean fire=false;
    boolean fired=false;
    
    
    
    public double getX()
{
return tankX;
}
    
    public double getY()
    {
        return tankY;
    }
    
    
    public void setX(double newX)
    {
        tankX = newX;
    }
    
    public void setY(double newY)
    {
        tankY = newY;
    }
    
    
    
}


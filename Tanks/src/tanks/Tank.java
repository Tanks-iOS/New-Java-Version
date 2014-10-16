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
    double tankSpeed = 10;
    double bearing=0;

    boolean hitLeft = false;
    boolean hitRight = false;
    boolean hitUp = false;
    boolean hitDown = false;

    int bulletMag = 6;
    int amo = bulletMag;
    long reloadTime = 600000000;
    long triggerSpeed = 300000000;
    double fireAngle=0;
    boolean trigger= false;
    boolean fire = false;
    boolean fired = false;

    Tank(){
    
    }
    public void setBearing(double angle){
        bearing=angle;
    }
    public double getBearing(){
        return bearing;
    }
    public double getX() {
        return tankX;
    }
    public double getY() {
        return tankY;
    }
    public void setPosition(double newX, double newY) {
        tankX = newX;
        tankY = newY;   
    } 
    
    public void moveLeft(){
        tankX -=tankSpeed;
    }
    public void moveRight(){
        tankX +=tankSpeed;
    }
    public void moveUp(){
        tankY -=tankSpeed;
    }
    public void moveDown(){
        tankY +=tankSpeed;
    }

}

package com.company;

public class MovableRectangle extends MovablePoint{
    private MovablePoint topLeft = new MovablePoint(2, 4,5,5);
    private MovablePoint bottomRight = new MovablePoint(7,6,5,5);

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        super(x1, y1, xSpeed, ySpeed);
        if(topLeft.ySpeed == bottomRight.ySpeed && topLeft.xSpeed == bottomRight.xSpeed){
            this.x = x1;
            this.y = y1;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }
    }
    public String toString(){
        return "Rectangle: \n";
    }
    public void moveUp() {
        if(y > 0) {
            System.out.println("The rectangle is move up by " + y + " at a speed of " + ySpeed);
        }
    }
    public void moveDown() {
        if(y < 0) {
            System.out.println("The rectangle is move down by " + y + " at a speed of " + ySpeed);
        }
    }
    public void moveLeft() {
        if(x>0) {
            System.out.println("The rectangle is move left by " + x + " at a speed of " + xSpeed);
        }
    }
    public void moveRight() {
        if(x<0) {
            System.out.println("The rectangle is move right by " + x + " at a speed of " + xSpeed);
        }
    }
}

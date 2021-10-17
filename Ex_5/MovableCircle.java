package com.company;

public class MovableCircle extends MovablePoint{
    private int radius;
    private MovablePoint center = new MovablePoint(1, 2, 3, 4);

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        super(x, y, xSpeed, ySpeed);
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    public String toString(){
        return "Circle\n";
    }

    public void moveUp() {
        if(y > 0) {
            System.out.println("The circle is move up by " + y + " at a speed of " + ySpeed);
        }
    }
    public void moveDown() {
        if(y < 0) {
            System.out.println("The circle is move down by " + y + " at a speed of " + ySpeed);
        }
    }
    public void moveLeft() {
        if(x>0) {
            System.out.println("The circle is move left by " + x + " at a speed of " + xSpeed);
        }
    }
    public void moveRight() {
        if(x<0) {
            System.out.println("The circle is move right by " + x + " at a speed of " + xSpeed);
        }
    }
}

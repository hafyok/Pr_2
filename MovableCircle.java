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

    public String to_string(){
        return "Circle\n";
    }

    public void moveUp() {
        System.out.println("The сircle is move up by " + y +" at a speed of " + ySpeed);
    }
    public void moveDown() {
        System.out.println("The сircle is move down by " + y +" at a speed of " + ySpeed);
    }
    public void moveLeft() {
        System.out.println("The сircle is move left by " + x +" at a speed of " + xSpeed);
    }
    public void moveRight() {
        System.out.println("The сircle is move right by " + x +" at a speed of " + xSpeed);
    }
}

package com.company;

public class MovablePoint implements Movable{
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;


    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "";
    }
    public void moveUp() {
        System.out.println("The point is move up by " + y +" at a speed of " + ySpeed);
    }
    public void moveDown() {
        System.out.println("The point is move down by " + y +" at a speed of " + ySpeed);
    }
    public void moveLeft() {
        System.out.println("The point is move left by " + x +" at a speed of " + xSpeed);
    }
    public void moveRight() {
        System.out.println("The point is move right by " + x +" at a speed of " + xSpeed);
    }
}

package com.company;
import java.lang.*;
import java.util.Scanner;

public class Ball {
    protected double x = 0, y = 0;

    Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    Ball(){
        x = 50.0;
        y = 50.0;
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(/*double xDis, double yDis*/){
        Scanner in = new Scanner(System.in);
        double y = in.nextDouble();
        double x = in.nextDouble();
    }
    public String toString(){
        return "Your ball is here: x = " + x + ", y = " + y;
    }

}

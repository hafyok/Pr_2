package com.company;
import java.math.*;

public class Square extends Shape{
    protected double side;

    public Square(){
        this.side = 50;
    }
    public Square(double s) {
        this.side = s;
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double s){
        this.side = s;
    }
    @Override
    double getArea(){
        return this.side*this.side;
    }
    @Override
    double getPerimeter(){
        return this.side*4;
    }
    @Override
    String to_String(){
        return "Shape: square, side: " + this.side;
    }
}

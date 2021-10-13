package com.company;
import java.math.*;

public class Circle_2 extends Shape_2{
    protected double radius;
    Circle_2(){
        this.radius = 9;
        color = "white";
        filled = false;
    }
    Circle_2(double radius){
        this.radius = radius;
    }
    Circle_2(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = "white";
        this.filled = true;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String to_String(){
        return "Shape: circle, radius: " + this.radius + ", color: " + this.color;
    }
}

package com.company;

import java.awt.*;

public class Rectangle_2 extends Shape_2{
    protected double width;
    protected double length;

    //Конструкторы
    Rectangle_2(){
        this.width = 10;
        this.length = 20;
        this.color = "black";
        this.filled = false;
    }
    Rectangle_2(double width, double length){
        this.width = width;
        this.length = length;
        this.color = "black";
        this.filled = false;
    }
    Rectangle_2(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public String to_String() {
        return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
    }
}

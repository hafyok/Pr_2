package com.company;

public class Square_3 extends Rectangle_3{
    Square_3(){
        double width = this.width;
        this.color = "black";
        this.filled = false;
    }
    Square_3(double side){
        this.width = side;
        this.color = "black";
        this.filled = false;
    }
    Square_3(double side, String color, boolean filled){
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return width;
    }
    public void setSide(double side){
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }
    @Override
    public void setLength(double side) {
        this.length = side;
    }
    @Override
    public String to_String() {
        return "Shape: square, side: " + this.width + ", color: " + this.color;
    }
}

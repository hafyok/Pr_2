package com.company;

public class Square_2 extends Rectangle_2{
    Square_2(){
        double width = this.width;
        this.color = "black";
        this.filled = false;
    }
    Square_2(double side){
        this.width = side;
        this.color = "black";
        this.filled = false;
    }
    Square_2(double side, String color, boolean filled){
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

package com.company;


public abstract class Shape_3 {
    protected String color;
    protected boolean filled;

    Shape_3(){
        this.color = "black";
        this.filled = false;
    }

    Shape_3(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getPerimeter();
    abstract double getArea();
    abstract String to_String();

}

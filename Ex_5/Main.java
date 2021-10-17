package com.company;

public class Main {

    public static void main(String[] args) {
        MovablePoint point_1 = new MovablePoint(2,4,6,8);
        point_1.toString();
        point_1.moveUp();
        point_1.moveDown();
        point_1.moveLeft();
        point_1.moveRight();
        System.out.println();

        MovableCircle circle_1 = new MovableCircle(3,3,5,8, 1);
        circle_1.toString();
        circle_1.moveUp();
        circle_1.moveDown();
        circle_1.moveLeft();
        circle_1.moveRight();
        System.out.println();

        MovableRectangle rec_1 = new MovableRectangle(1,2,3,4,5,5);
        rec_1.toString();
        rec_1.moveUp();
        rec_1.moveDown();
        rec_1.moveLeft();
        rec_1.moveRight();
    }
}

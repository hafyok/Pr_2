package com.company;

public class Main {

    public static void main(String[] args) {
        Shape_3 s1 = new Circle_3(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius());//мы сделали восходящее преобразование
        //у Shape_3 нет метода gerRadius()

        Circle_3 c1 = (Circle_3)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());//Т.к. мы опустили s1 в иерархии наследования,
        //теперь getRadius доступен

        Shape_3 s2 = new Shape_3();//Нельзя вызывать экземпляр абстрактного класса

        Shape_3 s3 = new Rectangle_3(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.getLength());//Та же ошибка, что и с объектом s1

        Rectangle_3 r1 = (Rectangle_3)s3; // downcast, приведение родительского типа к дочернему
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape_3 s4 = new Square_3(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide());


// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle_3 r2 = (Rectangle_3)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getSide());
        System.out.println(r2.getLength());

// Downcast Rectangle r2 to Square
        Square_3 sq1 = (Square_3)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}

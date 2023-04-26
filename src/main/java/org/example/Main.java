package org.example;

public class Main {
    public static void main(String[] args) {

        Square s = new Square(4);
        Shapes shapes = Square::getArea;

        System.out.println("Area: " + shapes.getArea(s));

    }//Need this too
}//leave it alone !!!
package org.example;

public class Square {
  private int sideSize;

    public Square(int sideSize) {
        this.sideSize = sideSize;
    }

    public int getArea (){

        return  sideSize*sideSize;
    }
}

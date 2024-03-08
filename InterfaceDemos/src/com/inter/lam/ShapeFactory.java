package com.inter.lam;

public class ShapeFactory {
    void printArea(IShape ishape, int x,int y){
        System.out.println("Printing area");
        ishape.area(x,y);
        System.out.println("Completed");


    }
}

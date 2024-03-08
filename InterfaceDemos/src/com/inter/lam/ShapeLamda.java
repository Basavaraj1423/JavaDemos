package com.inter.lam;

public class ShapeLamda {
    public static void main(String[] args) {
        //way 1
        IShape iShape = (x, y) -> System.out.println("The Rect:"+(x + y));
        iShape.area(10,20);

        //way 2
        IShape iShape1 = (int x, int y) -> {
            System.out.println("The Tri:"+(0.5*x*x));
        };
        iShape1.area(30,40);


    }
}

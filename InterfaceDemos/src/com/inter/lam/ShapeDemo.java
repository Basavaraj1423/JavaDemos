package com.inter.lam;

public class ShapeDemo  {
    public static void main(String[] args) {
        IShape iShape = new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("The area of 1st class is:" +(x * y));
            }
        };
        iShape.area(10,20);

        IShape iShape2 = new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("The area of 2nd class is:" +(x * y));
            }
        };
        iShape2.area(30,40);
    }
}

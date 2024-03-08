package com.inter.lam;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape iShape = new RectImpl();
        shapeFactory.printArea(iShape,10,20);
        System.out.println("**********************");

        //Using anonyms class:

        shapeFactory.printArea(new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Calculating area");
                System.out.println("Tri:"+(x*y*0.5));
            }
        },10,20);
        System.out.println("***********************");

        //using lamda expression
        shapeFactory.printArea((int x,int y)->{
            System.out.println("Calculating square area");
            System.out.println("Square is"+(x+y));

        },2,3);
    }
}

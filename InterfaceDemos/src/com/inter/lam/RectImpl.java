package com.inter.lam;

public class RectImpl implements IShape {
    @Override
    public void area(int x, int y) {
        System.out.println("Rectangle area is"+(x+y));
        System.out.println("This is a printArea method from Rechimpl");
    }
}

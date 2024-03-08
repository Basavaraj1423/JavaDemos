package com.inter.extend;

public class CalMain {
    public static void main(String[] args) {
        ICalculator iCalculator = new BasicCalculator();
        iCalculator.add(2,3);
        iCalculator.product(2,3);
        IScientific iScientific = new ScientificCalc();
        iScientific.square(2,3);
        iScientific.cube(10);
        iCalculator.sub(2,3);
    }
}

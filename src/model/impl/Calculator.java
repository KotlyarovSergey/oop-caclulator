package model.impl;

import model.Calculable;

public class Calculator implements Calculable {
    @Override
    public double plus(double val1, double val2) {
        return val1 + val2;
    }

    @Override
    public double minus(double val1, double val2) {
        return val1 - val2;
    }

    @Override
    public double multiple(double val1, double val2) {
        return val1 * val2;
    }

    @Override
    public double divide(double val1, double val2) {
        if(val2 == 0) throw new RuntimeException("Zero dividing");
        return val1 / val2;
    }
}
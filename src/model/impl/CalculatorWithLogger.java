package model.impl;

import model.Calculable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorWithLogger implements Calculable{
    private Calculable calculator;
    private final Logger logger;
    public CalculatorWithLogger(Calculable calculable, Logger logger){
        this.calculator = calculable;
        this.logger = logger;
    }

    @Override
    public double plus(double val1, double val2) {
        return calculator.plus(val1, val2);
    }

    @Override
    public double minus(double val1, double val2) {
        return calculator.minus(val1, val2);
    }

    @Override
    public double multiple(double val1, double val2) {
        return calculator.multiple(val1, val2);
    }

    @Override
    public double divide(double val1, double val2) {
        if(val2 == 0) {
            logger.log(Level.WARNING, "Zero dividing");
        }
        return calculator.divide(val1, val2);
    }


}

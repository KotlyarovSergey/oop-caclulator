package model.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CalcWithLog extends Calculator{
    private final Logger logger;
    public CalcWithLog(Logger logger){
        this.logger = logger;
    }

    @Override
    public double divide(double val1, double val2) {
        if(val2 == 0) {
            logger.log(Level.WARNING, "Zero dividing");
            throw new RuntimeException("Zero dividing");
        }
        return val1 / val2;
    }


}

package controller;

import model.Calculable;
import view.UserView;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UserControllerWithLogger extends UserController{
    private  final Logger logger;
    public UserControllerWithLogger(UserView view, Calculable calculator, Logger logger) {
        super(view, calculator);
        this.logger = logger;
    }

    @Override
    public void run(){
        logger.log(Level.INFO, "Program started");
        super.run();
        logger.log(Level.INFO, "Program ended");
    }
}

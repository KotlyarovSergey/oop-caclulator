import controller.UserController;
import controller.UserControllerWithLogger;
import model.Calculable;
import model.impl.CalculatorWithLogger;
import logger.CalcLogger;
import model.impl.Calculator;
import view.UserView;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        startWithLogging();
        //startWithoutLogging();
    }

    static void startWithLogging(){
        CalcLogger calcLogger = new CalcLogger(UserControllerWithLogger.class);
        Logger logger = calcLogger.setLogger();

        Calculable calculator = new CalculatorWithLogger(new Calculator(), logger);
        UserView view = new UserView();

        UserControllerWithLogger controller = new UserControllerWithLogger(view, calculator, logger);
        controller.run();
    }

    static void startWithoutLogging(){
        Calculable calculator = new Calculator();
        UserView view = new UserView();

        UserController controller = new UserController(view, calculator);
        controller.run();
    }
}

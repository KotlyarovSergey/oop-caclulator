package logger;

import controller.UserControllerWithLogger;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalcLogger {
    //private Logger logger = Logger.getLogger(Calculator.class.getName());
    //private Logger logger = Logger.getAnonymousLogger();
    private final Logger logger;
    final String logFileFullName = "\\src\\logger\\calc.log";

    public CalcLogger(Class<?> tClass) {
        this.logger = Logger.getLogger(tClass.getName());
    }

    public Logger setLogger(){
        try{
            FileHandler fileHandler = new FileHandler(System.getProperty("user.dir") + logFileFullName, true);
            logger.addHandler(fileHandler);
            SimpleFormatter sFormatter = new SimpleFormatter();
            fileHandler.setFormatter(sFormatter);
            return logger;
        }
        catch(Exception e){
            // что-то нужно сделать
        }
        return null;
    }
}

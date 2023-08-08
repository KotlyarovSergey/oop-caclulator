import controller.UserController;
import moderl.Calculable;
import moderl.impl.Calculator;
import view.UserView;

public class Main {
    public static void main(String[] args) {
        UserView view = new UserView();
        Calculable calculator = new Calculator();
        UserController controller = new UserController(view, calculator);
        controller.run();
    }
}

package controller;

import model.Calculable;
import util.InputParser;
import util.Operations;
import view.UserView;

import java.util.Scanner;

public class UserController {
    private final UserView view;
    private final Calculable calculator;
    private Double firstValue = 0.0;
    private Double secondValue = null;
    private Operations operation = Operations.none;
    public UserController(UserView view, Calculable calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void run(){
        view.showMessage("Введите выражение или 'q' для выхода\n");
        while (true){
            //System.out.printf("f: %s, s: %s, op: %s\n", firstValue, secondValue, operation.toString());
            view.showContent(firstValue, operation.toString());
            view.showMessage("Ввод: ");
            String input = userInput();
            if(input.equals("q")) {
                view.showMessage("Buy....\n");
                break;
            }

            // разбираем что там введено
            parseInput(input);

            // если второе число введено, можно вычислять
            if (secondValue != null){
                double result = calculate();
                view.showResult(firstValue, secondValue, operation.toString(), result);
                // после вычисления результат становится первым числом
                firstValue = result;
                // второе и операция обнуляются
                operation = Operations.none;
                secondValue = null;
            }
        }
    }

    private double calculate(){
        switch (operation){
            case plus:
                return calculator.plus(firstValue, secondValue);
            case minus:
                return calculator.minus(firstValue, secondValue);
            case mult:
                return calculator.multiple(firstValue, secondValue);
            case div:
                return calculator.divide(firstValue, secondValue);
        }
        return 0;
    }
    private void parseInput(String input) {
        InputParser parser = new InputParser();
        Double number = parser.parseNumber(input);
        // если введено число
        if(number != null){
            // если первое число не заполнено
            if(this.firstValue == null){
                this.firstValue = number;
            } else if (this.operation != Operations.none){
                // если уже введена операция, то это второе число
                this.secondValue = number;
            } else {
                // если операция еще не введена, переписываем первое число
                this.firstValue = number;
            }
        } else {
            // если не число, то может быть операция
            Operations operation = parser.parseOperation(input);
            if(operation != Operations.none){
                this.operation = operation;
            }
        }
    }

    private String userInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }




}

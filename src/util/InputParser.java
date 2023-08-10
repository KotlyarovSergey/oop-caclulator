package util;

public class InputParser {
    public Double parseNumber(String input){
        try {
            return Double.parseDouble(input);
        }catch (Exception e){
            return null;
        }
    }

    public Operations parseOperation(String input){
        switch (input){
            case "+":
                return Operations.plus;
            case "-":
                return Operations.minus;
            case "*":
                return Operations.mult;
            case "/":
                return Operations.div;
            default:
                return Operations.none;
        }
    }
}

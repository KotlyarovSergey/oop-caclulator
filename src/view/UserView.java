package view;

import util.DiscardZero;

public class UserView {
    public void showMessage(String message){
        System.out.print(message);
    }

    public void showResult(double val1, double val2, String operation, double result){
        StringBuilder builder = new StringBuilder();
        builder.append(DiscardZero.convert(val1))
                .append(" ")
                .append(operation)
                .append(" ")
                .append(DiscardZero.convert(val2))
                .append(" = ")
                .append(DiscardZero.convert(result));
        System.out.println(builder);
    }

}

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

    public void showContent(double val1, String operation){
        StringBuilder builder = new StringBuilder(DiscardZero.convert(val1));
        builder.insert(0, "\t[");
        if(operation != null){
            builder.append(" ")
                    .append(operation)
                    .append(" ");
        }
        builder.append("]");
        System.out.println(builder);
    }
}

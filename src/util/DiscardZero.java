package util;

public class DiscardZero {
    public static String convert(double value){
        if(value == (long) value)
            return String.format("%d",(long)value);
        else
            return String.format("%s",value);
    }

}

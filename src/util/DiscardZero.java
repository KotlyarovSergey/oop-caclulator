package util;

public class DiscardZero {
    public static String convert(double value){
//        DecimalFormat format = new DecimalFormat();
//        format.setDecimalSeparatorAlwaysShown(false);
//        return format.format(value);
        if(value == (long) value)
            return String.format("%d",(long)value);
        else
            return String.format("%s",value);
    }

}

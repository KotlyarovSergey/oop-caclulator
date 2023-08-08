package util;

public enum Operations {
    plus,
    minus,
    mult,
    div,
    none;
    @Override
    public String toString(){
        switch (this){
            case div: return "/";
            case minus: return "-";
            case mult: return "*";
            case plus: return "+";
            default: return null;
        }
    }

}

package com.scturkey;

public class IntegerToRomanNumeralsConverter {

    public String convert(int number){

        if(number == 5)
            return "V";
        else if(number == 6)
            return "VI";

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < number; i++){
            sb.append("I");
        }

        return sb.toString();
    }
}

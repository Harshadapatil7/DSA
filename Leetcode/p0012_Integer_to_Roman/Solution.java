package com.p0012_Integer_to_Roman;

public class Solution {

    public String getRoman(int num){
        switch(num){
            case 1: return "I";
            case 4: return "IV";
            case 5: return "V";
            case 9: return "IX";
            case 10: return "X";
            case 40: return "XL";
            case 50: return "L";
            case 90: return "XC";
            case 100: return "C";
            case 400: return "CD";
            case 500: return "D";
            case 900: return "CM";
            case 1000: return "M";
            default: return "";
        }
    }
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            int r;
            if(num >= 1000){
                r = 1000;
            } else if(num >= 900){
                r = 900;
            } else if(num >= 500){
                r = 500;
            } else if(num >= 400){
                r = 400;
            } else if(num >= 100){
                r = 100;
            } else if(num >= 90){
                r = 90;
            } else if(num >= 50){
                r = 50;
            }  else if(num >= 40){
                r = 40;
            } else if(num >= 10){
                r = 10;
            } else if(num >= 9){
                r = 9;
            } else if(num >= 5){
                r = 5;
            } else if(num >= 4){
                r = 4;
            } else{
                r = 1;
            }
            num -= r;
            sb.append(getRoman(r));
        }
        return sb.toString();
    }

}

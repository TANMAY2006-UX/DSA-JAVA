class Solution {
    public static String intToRoman(int num) {
        int temp = num;
        String roman = "";
        while(num >= 1000){
            roman = roman.concat(Value(1000));
            num -= 1000;
        }
        while(num >= 900){
            roman = roman.concat(Value(900));
            num -= 900;
        }
        while(num >= 500){
            roman = roman.concat(Value(500));
            num -= 500;
        }
        while(num >= 400){
            roman = roman.concat(Value(400));
            num -= 400;
        }
        while(num >= 100){
            roman = roman.concat(Value(100));
            num -= 100;
        }
        while(num >= 90){
            roman = roman.concat(Value(90));
            num -= 90;
        }
        while(num >= 50){
            roman = roman.concat(Value(50));
            num -= 50;
        }
        while(num >= 40){
            roman = roman.concat(Value(40));
            num -= 40;
        }
        while(num >= 10){
            roman = roman.concat(Value(10));
            num -= 10;
        }
        while(num >= 9){
            roman = roman.concat(Value(9));
            num -= 9;
        }
        while(num >= 5){
            roman = roman.concat(Value(5));
            num -= 5;
        }
        while(num >= 4){
            roman = roman.concat(Value(4));
            num -= 4;
        }
        while(num >= 1){
            roman = roman.concat(Value(1));
            num -= 1;
        }
        return roman;
    }

    public static String Value(int n){
        switch(n){
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
        }
        return "";
    }
}
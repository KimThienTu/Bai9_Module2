package BT_ChuongTrinhTinhKetQua;

public class FizzBuzzTranslate {
    public static String translate(int number){
        if (number <= 0 || number >= 100){
            return String.valueOf(number);
        }

        String result = "";

        if (number % 3 == 0 || String.valueOf(number).contains("3")){
            result += "Fizz";
        }
        if (number % 5 == 0 || String.valueOf(number).contains("5")){
            result += "Buzz";
        }

        if (result.isEmpty()){
            return String.valueOf(number);
            } else {
            return result;
        }
    }


    public static String translateToText(int number){
        if (number <= 0 || number >= 100){
            return String.valueOf(number);
        }

        String[] units = {"","một","hai","ba","bốn","năm","sáu","bảy", "tám","chín",
                          "mười","mười một","mười hai","mười ba","mười bốn","mười năm",
                          "mười sáu","mười bảy","mười tám","mười chín"};

        String result = "";

        if (number % 3 == 0 || String.valueOf(number).contains("3")){
            result += "Fizz";
        }
        if (number % 5 == 0 || String.valueOf(number).contains("5")){
            result += "Buzz";
        }

        if (result.isEmpty()){
            if (number <= 20){
                result = units[number];
            } else if (number < 100){
                int tens = number / 10;
                int ones = number % 10;
                result = units[tens] + " " + (ones == 0 ? "mươi" : "mươi" + units[ones]);
            }
        }
        return result;
    }
}

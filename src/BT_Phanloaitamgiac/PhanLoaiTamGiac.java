package BT_Phanloaitamgiac;

public class PhanLoaiTamGiac {
    public static String tamGiac (int a, int b, int c){
        if (a <= 0 || b <= 0 || c <= 0){
            return "Không phải là tam giác";
        } else if (a + b <= c || b + c <= a || c + a <= b){
            return "Không phải là tam giác";
        }else if (a == b && b == c){
            return "Tam giác đều";
        } else if (a == b || b == c || c == a){
            return "Tam giác cân";
        } else {
            return "Tam giác thường";
        }
    }
}

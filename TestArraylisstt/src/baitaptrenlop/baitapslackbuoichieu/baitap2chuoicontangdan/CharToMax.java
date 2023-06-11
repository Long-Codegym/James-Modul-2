package baitaptrenlop.baitapslackbuoichieu.baitap2chuoicontangdan;

public class CharToMax {
    public static String strMax1(String str) {
        String strMax = "";
        String strMin = "";
        for (int i = 0; i < str.length()-1; i++) { // duyệt for
            strMin += str.charAt(i); // in từng phần tử vào strMin
            if (str.charAt(i + 1) < str.charAt(i)) { // trong if so sánh giá trị đầu vs giá trị tiếp theo
                if (strMin.length() > strMax.length()) { // nếu điều kiện trên đúng ss độ dài chuô ký tự
                    strMax = strMin; // gắn lại chuỗi strMax = strMin
                }
                strMin = "";
            }
        }
        //  kiểm tra ký tự cuối cùng
        strMin += str.charAt(str.length() - 1);
        if (strMin.length() > strMax.length()) {
            strMax = strMin;
        }
        return strMax;
    }

    public static void main(String[] args) {

        System.out.println(strMax1("adgdhadkloiuytrabznz"));
    }
}

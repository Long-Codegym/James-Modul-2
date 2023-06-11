package baitaptrenlop.baitapslackbuoichieu.timchuoicododailonnhatkocokytulaplai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimDoDaiChuoiLonNhat {
//    List<Character> chars = new ArrayList<>();

    public static String findStringWithGreatestLength(String str){
        String strMax= "";
        for (int i = 0; i < str.length(); i++) {
            String str1= "";
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (str1.indexOf(c) == -1 ){
                    str1 += c;
                    if (str1.length()>strMax.length()){
                        strMax = str1;
                    }
                }else {
                    System.out.println(Arrays.toString(new String[]{strMax}));
                    break;
                }
            }
        }
        return strMax;
    }


    public static void main(String[] args) {
        findStringWithGreatestLength("adkfeywwa");
    }
}

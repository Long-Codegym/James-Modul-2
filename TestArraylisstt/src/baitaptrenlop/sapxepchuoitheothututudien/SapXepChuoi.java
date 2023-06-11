package baitaptrenlop.sapxepchuoitheothututudien;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SapXepChuoi {
    public static List<String> sap_xep_theo_dien(List<String> arr){
        Collections.sort(arr);
        System.out.println(" chuỗi sau khi đã sắp xếp");
        System.out.println(arr.toString());
        return arr;
    }

    public static void main(String[] args) {
       ArrayList<String> arr = new ArrayList<>();
        arr.add("sdasd");
        arr.add("VladimirLong");
        arr.add("a");
        arr.add("A");
        sap_xep_theo_dien(arr);
    }
}

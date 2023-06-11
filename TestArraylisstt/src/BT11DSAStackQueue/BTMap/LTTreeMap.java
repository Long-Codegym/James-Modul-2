package BT11DSAStackQueue.BTMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LTTreeMap {
    public TreeMap kTChuoi(String str) {

        TreeMap<Integer, Character> chuoikt = new TreeMap<>();
        Character[] charrr = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charrr[i] = str.charAt(i);
        }
        for (int i = 0; i < charrr.length; i++) {
            if (!chuoikt.containsKey(i)) {
                chuoikt.put(1, charrr[i]);
            } else {
                int count;
                count = chuoikt.get(charrr[i]);
                chuoikt.put(count + 1, charrr[i]);
            }
        }
        return chuoikt;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LTTreeMap test = new LTTreeMap();
        System.out.println(" nhập chuỗi cần đếm");
        String str = scanner.nextLine();
        TreeMap<Integer, Character> result = test.kTChuoi(str);
        for (int i = 0; i < result.size(); i++) {
                int count = result.get(i);
            System.out.println(result.get(i)  + " xuất hiện " + count + " lần");
        }
    }
}

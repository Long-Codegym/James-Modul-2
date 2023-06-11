package BT13.optionalcaidatthuattoantimkiemnhiphansudungdequy;

import java.util.Arrays;
import java.util.Scanner;

public class SearchNhiphan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập giá trị");
        int values = Integer.parseInt(scanner.nextLine());
        System.out.println(" Nhập độ dài mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr= new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" Nhập giá trị ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        int index = binarySearch(arr, values);
        if (index != - 1){
            System.out.println("  có giá trị đso trong mảng" + values + " vị trí " + index);
        }else {
            System.out.println("ko có giá trị đó trong mảng" );
        }
    }
    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                left = middle +1;
            }else {
                right = middle -1;
            }
        }
        return -1;
    }
}

package baitaptrenlop.dayfibonacci;

public class KiemTraDayFibonacci {
    public static boolean kiem_tra_day_fibonacci(int[] arr){
        for (int i =2 ; i < arr.length; i++) {
            if (arr[i] != arr[i -1] + arr[i - 2]){
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {
     int[] arr1 = {0,1,1,2,3,5,8,13,21,34};
     int[] arr2 = {1,3,5,7,11,13,14,15};
        System.out.println(kiem_tra_day_fibonacci(arr1));
        System.out.println(kiem_tra_day_fibonacci(arr2));
    }
}

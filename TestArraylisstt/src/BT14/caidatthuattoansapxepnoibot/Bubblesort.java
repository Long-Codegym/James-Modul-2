package BT14.caidatthuattoansapxepnoibot;

public class Bubblesort {
    public static void bubblesort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list = new int[5];
        bubblesort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}


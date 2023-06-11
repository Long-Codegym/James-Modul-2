package BT13.thuchanhcaidatthuattoantimkiem;

public class BinarySearch {
    static int[] list = {2,3,6,8,10,11,12,14,15,18};
    public static int binarySearch(int[] list, int key){
        int dau= 0;
        int cuoi= list.length-1;
        while (dau<=cuoi){
            int giua = (dau + cuoi)/2;
            if (key <list[giua]){
                cuoi = giua -1;
            }else if (key == list[giua]){
                return giua;
            }else {
                dau = giua+1;
            }
        }
        return -1;
    }
}

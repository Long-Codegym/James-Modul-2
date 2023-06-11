package baitaptrenlop.timsochinhphuong;

public class TimSoChinhPhuong {
    public static   int tim_so_chinh_phuong_gan_nhat(int n) {
        int i;
        for ( i = n ; i > 0; i--) {
            boolean check = false;
            if (i% Math.sqrt(i) ==0){
                check = true;
            }if (check){
                System.out.println( " số chính phương gần nhất là " + i);
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        tim_so_chinh_phuong_gan_nhat(65);
    }
}

package BT16.thuchanhdocfile;

import java.io.*;

public class ReadFileExample {
    public static void readFileText() {

        try {
            // Đọc file theo đường dẫn
            File file = new File("E:\\TestArraylisst\\TestArraylisstt\\src\\BT16\\thuchanhdocfile\\numbersInt.txt");
            // kiểm tra nếu file không tồn tại thì ném ra ngoại lệ
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println(" Tổng = " + sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(" file không tồn tại.");
        }
    }

    public static void main(String[] args) {
        readFileText();
    }
}

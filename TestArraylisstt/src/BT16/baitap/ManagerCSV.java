package BT16.baitap;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerCSV {
    static List<CSV> readFile = new ArrayList<>();
    public static void readFileCSV(String filePath){
        try{
            // Đọc file theo đường dẫn truyền vào thông qua filePath
            File file = new File(filePath);
            // kiểm tra nếu file ko tồn tại ném ra ngoại lệ
            if (!file.exists()){
                throw  new FileNotFoundException();

            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine())!=null){
                String[] str = line.split(",");
                readFile.add(new CSV(Integer.parseInt(str[0]), str[1],str[2]));
            }
            bufferedReader.close();
            System.out.println(readFile);

        } catch (FileNotFoundException e) {
            System.out.println(" File ko tồn tại");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Nhập đường dẫn file");
            String filPath = scanner.nextLine();
            readFileCSV(filPath);
        }
    }
}

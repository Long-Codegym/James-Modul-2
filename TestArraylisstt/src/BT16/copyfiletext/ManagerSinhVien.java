package BT16.copyfiletext;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerSinhVien {
    static Scanner scanner = new Scanner(System.in);
    static List<SinhViens> danhSachSinhViens = new ArrayList<>();

    public static void readFile() {
        try {
            // Đọc file theo đường dẫn
            File fileSinhVien = new File("E:\\TestArraylisst\\TestArraylisstt\\src\\BT16\\copyfiletext\\readFile.txt");
            // kiểm tra nếu file ko tồn tại ném ra ngoại lệ
//            if (!fileSinhVien.exists()){
//                throw new FileNotFoundException();
//            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileSinhVien));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                danhSachSinhViens.add(new SinhViens(str[0], str[1], str[2]));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writerFile(String files) {
        try {
            System.out.println(" Nhập tên");
            String name = scanner.nextLine();
            System.out.println(" Nhập số điện thoại");
            String phone = scanner.nextLine();
            System.out.println(" Nhập địa chỉ");
            String addres = scanner.nextLine();
            SinhViens sinhViens = new SinhViens(name, phone, addres);
            FileWriter writer = new FileWriter(files, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("\n" + sinhViens.toString());
            bufferedWriter.close();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        readFile();
        System.out.println(danhSachSinhViens);
        writerFile("E:\\TestArraylisst\\TestArraylisstt\\src\\BT16\\copyfiletext\\writerFile.txt");
    }
}


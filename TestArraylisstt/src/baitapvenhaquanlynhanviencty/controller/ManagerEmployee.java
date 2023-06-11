package baitapvenhaquanlynhanviencty.controller;

import baitapvenhaquanlynhanviencty.model.AdminnistrativeEmployee;
import baitapvenhaquanlynhanviencty.model.Employee;
import baitapvenhaquanlynhanviencty.model.SalesEmployee;
import baitapvenhaquanlynhanviencty.model.TechnicalEmployee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerEmployee {
    Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();

    // thêm nhân viên
    public void addEmployee() {
        int select = menuChoiceAddTypeEmployee();
        if (select == 1) {
            AdminnistrativeEmployee newAdminnistrativeEmployee = new AdminnistrativeEmployee(inputName(), inputAge(), inputSalary(), inputDate(), inputDayOff());
            employeeList.add(newAdminnistrativeEmployee);
        }
        if (select == 2) {
            TechnicalEmployee newTechnicalEmployee = new TechnicalEmployee(inputName(), inputAge(), inputSalary(), inputDate(),inputProject() );
            employeeList.add(newTechnicalEmployee);
        }
        if (select == 3) {
            SalesEmployee newSalesEmployee = new SalesEmployee(inputName(), inputAge(), inputSalary(), inputDate(),inputSales() );
            employeeList.add(newSalesEmployee);
        }
    }

    // hiển thị nhân viên
    public void showEmployee() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    // hàm check tên
    public boolean checkName(String name) {
        while (!name.matches("[a-zA-Z\\s]+")) {
            return false;
        }
        return true;
    }


    // hàm sửa, thêm tên
    public String inputName() {
        String name;
        System.out.println(" Nhập tên nhân viên");
        name = scanner.nextLine();
        if (name.isEmpty()) {
            System.out.println(" Tên không được để trống.");
            inputName();
        }
        if (!checkName(name)) {
            System.out.println(" Tên không được cứa các ký tự đặt biệt");
        }
        return name;
    }

    // nhập tuổi
    public int inputAge() {
        int age = 0;
        try {
            System.out.println(" Nhập tuổi:");
            age = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println(" Nhập sai");
            inputAge();
        }
        return age;
    }

    // nhập ngày
    public double inputDate() {
        double date = 0;
        return date;
    }

    //mức lương cơ bản
    public double inputSalary() {
        double salary = 0;
        try {
            System.out.println(" Nhập mức lương:");
            salary = Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            System.out.println(" Nhập sai vui lòng nhập lại:");
            inputSalary();
        }
        return salary;
    }

    // tính tổng lương
    public double calculateSalary() {
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    // nhập ngày nghỉ nhâp viên văn phòng
    public double inputDayOff() {
        double dayOff;
        System.out.println(" Nhập số ngày nghỉ:");
        dayOff = Double.parseDouble(scanner.nextLine());
        return dayOff;
    }

    //Nhập số project đã làm
    public int inputProject(){
        int project ;
        project = Integer.parseInt(scanner.nextLine());
        return project;
    }

    // Nhập doanh số bán hàng
    public int inputSales(){
        int sales;
        sales = Integer.parseInt(scanner.nextLine());
        return sales;
    }

    public int menuChoiceAddTypeEmployee() {
        int choice = 0;
        boolean check;
        System.out.println(" Chọn để thêm nhân viên theo từng nghiệp vụ. \n"
                + " 1. Nhân viên hành chính (AdministrativeEmployee). \n"
                + " 2. Nhân viên kỹ thuật (TechicalEmployee). \n"
                + " 3. Nhân viên kinh doanh (SalesEmployee).");
        do {
            check = true;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                check = false;
                System.out.println(" Mục bạn chọn không có trong menu hãy chon lại.");
            }
        } while (!check || (choice != 1 && choice != 2 && choice != 3));
        return choice;
    }


//    // đọc file
//    public static void readFile(String filePath) {
//        try {
//            File fileEmmployee = new File(filePath);
//            if (!fileEmmployee.exists()) {
//                throw new FileNotFoundException();
//            }
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileEmmployee));
//            String line = "";
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] str = line.split(",");
//                employeeList.add(new Employee(str[0]) {
//                };
//            }
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

    // ghi vào file
    public static void writerFile(String filepath) {
        try {
            FileWriter writer = new FileWriter(filepath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(employeeList.toString());
            bufferedWriter.close();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    // điểm danh bằng ID chưa xong
    public void date(int iD) {
        for (Employee employee : employeeList) {
            if (employee.getId() == iD) {
                employee.getDate();
            }
        }
    }


}

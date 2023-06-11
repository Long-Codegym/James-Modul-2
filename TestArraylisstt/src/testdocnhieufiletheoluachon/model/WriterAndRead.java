package testdocnhieufiletheoluachon.model;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriterAndRead {

    static List<Students> studentsList = new ArrayList<>();
    static List<Students> teacherList = new ArrayList<>();
    static List<Students> accountList = new ArrayList<>();
    static List<Students> accountPending = new ArrayList<>();


    // chọn để đọc hay in
    public static String choicePath(int choice) {
        String filePath = "";
        switch (choice) {
            case 1: // tài khoản chưa được Activate của sinh viên
                filePath = "E:\\TestArraylisst\\TestArraylisstt\\src\\testdocnhieufiletheoluachon\\file\\accontPending.txt";
                break;
            case 2: // tài khoản được Activate của sinh viên
                filePath = "E:\\TestArraylisst\\TestArraylisstt\\src\\testdocnhieufiletheoluachon\\file\\accountActivate";
                break;
            case 3: // danh sách sinh viên  giáo viên bộ môn được quyền chỉnh sửa điểm môn học đó
                // giáo viên chủ nhiệm có thể in ra danh sách sinh viên và điểm
                // admin có quyền xóa sinh viên khỏi danh sách
                filePath = "E:\\TestArraylisst\\TestArraylisstt\\src\\testdocnhieufiletheoluachon\\file\\StudentsList.txt";
                break;
            case 4: // danh sách giáo viên admin có quyền xuất tới
                filePath = "E:\\TestArraylisst\\TestArraylisstt\\src\\testdocnhieufiletheoluachon\\file\\TeacherList.txt";
                break;
            default:
        }
        return filePath;
    }


    public static void readFilee(int choice) {
        String linkFileRead = choicePath(choice);
        ObjectInputStream fileRead = null;
        try {
            fileRead = new ObjectInputStream(new FileInputStream(linkFileRead));
            Students students = (Students) fileRead.readObject();
            System.out.println(students);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writerFile(int choice, List<Students> list) {
        String linkFileWriter = choicePath(choice);
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(linkFileWriter))) {
            oos.writeObject(list);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

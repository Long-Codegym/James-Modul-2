package BT12.THphanbietgiuahashMapvaHashSetAssignment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class main {
    public static void main(String[] args) {
        Student student1 = new Student("Long", 19, "TB");
        Student student2 = new Student("Long2", 20, "TB");
        Student student3 = new Student("Long3", 21, "TB");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(1, student2);
        studentMap.put(1, student3);
        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

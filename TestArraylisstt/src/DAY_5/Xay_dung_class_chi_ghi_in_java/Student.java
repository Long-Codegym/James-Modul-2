package DAY_5.Xay_dung_class_chi_ghi_in_java;

public class Student {
    private String name = "Vladimir";
    private String classes = "CO2";
    public Student(){
    }


    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // dùng Tostring để viết ra các thuộc tính của đối tượng
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", classes='" + classes + '\'' +
//                '}';
//    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
//    public  void display(){
//        System.out.println(name + " " + classes);
//    }

}

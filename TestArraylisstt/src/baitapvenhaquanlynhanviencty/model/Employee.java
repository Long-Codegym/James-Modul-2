package baitapvenhaquanlynhanviencty.model;

public abstract class Employee {
    static int count;
    private int id;
    private String name;
    private int age;
    private double salary;
    private double date;

    public Employee() {
    }

    public Employee( String name, int age, double salary, double date) {
        this.id = ++count;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.date = date;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract double getSalary();

    public double getDate() {
        return date++;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }
}


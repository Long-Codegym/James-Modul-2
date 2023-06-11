package baitapvenhaquanlynhanviencty.model;

public class AdminnistrativeEmployee extends Employee {
    private double daysOff;

    public AdminnistrativeEmployee() {
    }

    public AdminnistrativeEmployee(double daysOff) {
        this.daysOff = daysOff;
    }

    public AdminnistrativeEmployee(String name, int age, double salary, double date, double daysOff) {
        super(name, age, salary, date);
        this.daysOff = daysOff;
    }

    public double getDaysOff() {
        return daysOff;
    }

    public void setDaysOff(double daysOff) {
        this.daysOff = daysOff;
    }

    @Override
    public double getSalary() {
        return 500*(getDate() - daysOff);
    }

    @Override
    public String toString() {
        return super.toString() +"AdminnistrativeEmployee{" +
                "daysOff=" + daysOff +
                '}';
    }
}

package baitapvenhaquanlynhanviencty.model;

public class TechnicalEmployee extends Employee {
    private int projects;

    public TechnicalEmployee() {
    }

    public TechnicalEmployee(int projects) {
        this.projects = projects;
    }

    public TechnicalEmployee( String name, int age, double salary, double date, int projects) {
        super( name, age, salary, date);
        this.projects = projects;
    }

    public int getProjects() {
        return projects;
    }

    public void setProjects(int projects) {
        this.projects = projects;
    }

    @Override
    public double getSalary() {
        return 500*getDate() + 200*projects;
    }

    @Override
    public String toString() {
        return  super.toString() + "TechnicalEmployee{" +
                "projects=" + projects +
                '}';
    }
}

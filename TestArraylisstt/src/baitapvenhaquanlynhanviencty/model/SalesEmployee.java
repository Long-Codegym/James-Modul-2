package baitapvenhaquanlynhanviencty.model;

public class SalesEmployee extends Employee{
    private double sales;

    public SalesEmployee() {
    }

    public SalesEmployee(double sales) {
        this.sales = sales;
    }

    public SalesEmployee( String name, int age, double salary, double date, int sales) {
        super( name, age, salary, date);
        this.sales = sales;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public double getSalary() {
        return 300*getDate() + 50*sales ;
    }

    @Override
    public String toString() {
        return  super.toString()+ "SalesEmployee{" +
                "sales=" + sales +
                '}';
    }
}

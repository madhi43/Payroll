public class Main {
    public static void main(String[] args) {
        SalariesEmployee pay = new SalariesEmployee("Raj",1000000);
        HourlyEmployee hour =new HourlyEmployee("sree",20.0,60.0);
        System.out.println("Salaried Employee: " + SalariesEmployee.getName());
        System.out.println("Monthly Salary: $" + pay.calculatepay());
        System.out.println("\nHourly Employee: " + HourlyEmployee.getName());
        System.out.println("Weekly Pay: $" + hour.calculatepay());


    }
}
abstract class Employee{
    private static String name;
    Employee(String name){
        this.name = name;

    }
    public static String getName(){
        return name;
    }
    public double calculatePay() {
        return 0.0;
    }


    public abstract double calculatepay();
}
class SalariesEmployee extends Employee{
    private static double salary;

    public SalariesEmployee(String name,double salary){
        super(name);
        SalariesEmployee.salary = salary;
    }
    public double calculatepay()
    {
        return salary;
    }
}
class HourlyEmployee extends Employee{
    private double hourlyrate;
    private final double hoursworked;
    public HourlyEmployee(String name,double hourlyrate,double hoursworked){
        super(name);
        this.hourlyrate=hourlyrate;
        this.hoursworked=hoursworked;

    }

    @Override
    public double calculatepay() {
        return hourlyrate*hoursworked;
    }
}
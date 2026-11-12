import java.util.Scanner;
class Employee{
    public double totalsalary(){
        return 0.0;
    }
}
class FullTimeEmployee extends Employee {
    double basepay;
    double bonus;

    @Override
    public double totalsalary() {
            return basepay + bonus;
        }
    }
    class PartTimeEmployee extends Employee {
        double hourlyRate;
        double hoursWorked;

        @Override
        public double totalsalary() {
            return hourlyRate * hoursWorked;
        }
    }

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee type (Full-time or Part-time): ");
        String employeeType = input.nextLine();

        if (employeeType.equalsIgnoreCase("Full-time")){
            FullTimeEmployee employee = new FullTimeEmployee();
            System.out.println("Enter Base Pay: ");
            employee.basepay = input.nextDouble();
            System.out.println("Enter bonus: ");
            employee.bonus = input.nextDouble();
            System.out.println("Monthly Salary:  $"+employee.totalsalary());
        } else if (employeeType.equalsIgnoreCase("Part-time")){
            PartTimeEmployee employee = new PartTimeEmployee();
            System.out.println("Enter hourly rate: ");
            employee.hourlyRate = input.nextDouble();
            System.out.println("Enter hours worked: ");
            employee.hoursWorked = input.nextDouble();
            System.out.println("Monthly Salary: $" +employee.totalsalary());
        } else {
            System.out.println(" Invalid employee type.");
        }
        input.close();
    }
}
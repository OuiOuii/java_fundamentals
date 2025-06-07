package oop_advance.records;
//these utils will be explained soon
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Payable> employees = new ArrayList<>();

        employees.add(new SalariedEmployee("John", 5000.00));
        employees.add(new HourlyEmployee("Alice", 20.00, 80));

        for (Payable employee : employees) {
            System.out.printf("Name: %s%n", employee.employeeName());
            System.out.printf("Pay: $%.2f%n", employee.calculatePay());
            System.out.println("================");
        }
    }
}

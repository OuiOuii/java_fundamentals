package oop_advance.records;

public record SalariedEmployee(String name, double monthlySalary) implements Payable {
    @Override
    public double calculatePay(){
        return monthlySalary;
    }

    @Override
    public String employeeName(){
        return name;
    }
}

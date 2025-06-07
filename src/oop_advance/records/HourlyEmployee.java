package oop_advance.records;

public record HourlyEmployee(String name, double hourlyRate, int hoursWorked) implements Payable {
    @Override
        public double calculatePay(){
        return hourlyRate * hoursWorked;
    }

    @Override
    public String employeeName(){
        return name;
    }
}

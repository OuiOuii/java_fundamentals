package oop_advance.method_chaining;

public class FluentCalculator {
    private double start;  

    public FluentCalculator start(double value){
        this.start = value;
        return this;
    }

    public FluentCalculator add(double value){
        this.start += value;
        return this;
    }

    public FluentCalculator subtract(double value){
        this.start -= value;
        return this;
    }

    public FluentCalculator multiply(double value){
        this.start *= value;
        return this;
    }

    public FluentCalculator divide(double value){
        this.start /= value;
        return this;
    }

    public double getResult(){
        return start;
    }
}
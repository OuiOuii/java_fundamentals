package oop_advance.static_and_dynamic_binding;

public class Circle extends Shape{
    @Override
    double area(double a){
        return Math.PI * Math.sqrt(a);
    }
}

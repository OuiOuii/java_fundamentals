package oop_basics.statics;

public class Mathtools {
    
    //this is a static method, it is OWNED by the class itself and not to each object instantiated.
    static int add(int a, int b){
        return a + b;
    }

    //this is a static method, it is NOT owned by the class itself therefore the values can NOT BE SHARED by each objects.
    int multiply(int a, int b){
        return a * b;
    }
}

package oop_advance.inheritance;

//this is a child/subclass
public class Student extends Person{// "extends" means it inherits from Person
    int studentId;

    Student(int studentId){
        this.studentId = studentId;
    }

    @Override //greet() is from Person superclass and is overridden to change the output.
    public void greet(){
        System.out.printf("My student ID is %d.", studentId);
    }
}
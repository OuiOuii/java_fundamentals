package oop_basics.classes_and_objects;

public class Main {
    public static void main(String []args){
        //Instantiate (create an object) Student Object from Student.java
        Student st = new Student();

        //set the value of property of the created object
        st.name = "Jericho";
        st.age = 22;

        //call the method of the created object
        st.sayHello();
    }
}
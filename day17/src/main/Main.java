package main;

import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Marko", "Todic");
        System.out.println(student.sayHello());
    }
}

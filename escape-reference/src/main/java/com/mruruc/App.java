package com.mruruc;


import java.util.List;

public class App {
    public static void main(String[] args) {


        // Creating an instance of StudentManager
        StudentManager manager = new StudentManager();

        // Adding a student to the manager
        manager.addStudent(new Student(1, "Alice"));

        // Printing the original list of students
        System.out.println("====== Original List of Students ======");
        manager.getStudents().forEach(student -> System.out.println(student));

        // Someone tries to get the list of students
        List<Student> studentList = manager.getStudents();

        // Attempt to modify the list (this should fail)
        System.out.println("\nTrying to add a new student to the immutable list...");
        try {
            studentList.add(new Student(2, "Bob"));
        } catch (UnsupportedOperationException exception) {
            System.out.println("Exception caught: Cannot modify immutable list.");
            // Uncomment the next line if you want to print the stack trace
            // exception.printStackTrace();
        }

        // Printing the list again to show that it has not been modified
        System.out.println("\n======= List of Students after the attempt to modify =======");
        manager.getStudents().forEach(student -> System.out.println(student));


    }
}

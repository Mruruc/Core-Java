# Understanding Reference Escape in Java

Reference escape in programming, 
particularly in Java, is when an object reference becomes accessible from outside its intended scope. 
This can lead to unintended modifications or usage of the object, potentially causing bugs or security issues.

## Example Scenario

Consider a class that manages a list of students:

```java
public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
```
In this class, `students` is a private list that should only be modified using the `addStudent` method.
However, the `getStudents` method returns the actual reference to the `students` list, leading to a reference escape.

## Problem Illustration

Here's an example of how this can cause problems:

```java
public class App {
    public static void main(String[] args){
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student(1,"Alice"));

        //printing original list
        System.out.println("======Original List Itself =================");
        manager.getStudents().forEach(System.out::println);

        // Someone gets the list of students
        List<Student> studentList = manager.getStudents();

        // They can modify this list outside the StudentManager
        studentList.add(new Student(2,"Bob"));

        //printing original list
        System.out.println("=======After List has been accessed and modified==============");
        manager.getStudents().forEach(System.out::println);
    }
}
```
```
======Original List Itself =================
Student{ID:1, Full Name:Alice}
=======After List has been accessed and modified==============
Student{ID:1, Full Name:Alice}
Student{ID:2, Full Name:Bob}
```

## Solution

To prevent this, we should return a copy of the list or an unmodifiable view of the list:

```java
public class StudentManager {
    // ... other members of the class ...

    public List<Student> getStudents() {
        return new ArrayList<>(students); // Return a copy
        // or
        return Collections.unmodifiableList(students); // Return an unmodifiable view
      
        //or the more cute :)
        return students.stream().toList();
        
    }
}
```
By doing this, we ensure that the internal state of our StudentManager cannot be altered unexpectedly from the outside, thus preventing the escape of references.

```java
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

```
```
====== Original List of Students ======
Student{ID:1, Full Name:Alice}

Trying to add a new student to the immutable list...
Exception caught: Cannot modify immutable list.

======= List of Students after the attempt to modify =======
Student{ID:1, Full Name:Alice}

```

package com.mruruc;

import java.util.LinkedList;
import java.util.List;


public class StudentManager {
    private List<Student> students;
    public StudentManager(){
        this.students=new LinkedList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        //return new LinkedList<>(students);
        //or
        // return Collections.unmodifiableList(students);
        //or the best and more cute :)
        return students.stream().toList();
    }

}

package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Subject {
    String nazwa;
    Person teacher;
    Student student;
    ArrayList<Student> list = new ArrayList<Student>();

    public Subject(String nazwa) {
        this.nazwa = nazwa;
    }
    public void setTeacher(Person person) {
        this.teacher = person;
    }

    public void addStudent(Student student) throws TooManyStudentsException{
        this.student = student;
        list.add(student);

        /*
        if(list.size()!= 0) {
            throw new TooManyStudentsException();
        }
        */
    }

    public String toString() {
        return nazwa + ", " + "teacher: " + teacher.imie + ", students: " + student.imie;
    }

}

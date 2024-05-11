package com.damilola.schoolmodel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Personnel{
    private int studentId;
    private String studentLevel;
    Map<String, List<Course>> courseOffered = new HashMap<>();

    public Student(int studentId,String name, int age, String gender, String address, String studentLevel) {
        super(name, age, gender, address);
        this.studentId = studentId;
        this.studentLevel = studentLevel;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentLevel() {
        return studentLevel;
    }

    public void setStudentLevel(String studentLevel) {
        this.studentLevel = studentLevel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentLevel='" + studentLevel + '\'' +
                '}';
    }
}

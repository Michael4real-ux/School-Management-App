package com.damilola.schoolmodel;

public class Teacher extends Staff {
    private String courseBeingOffered;

    public Teacher(String name, int age, String gender, String address, int staffId, String position, double salary, String courseBeingOffered) {
        super(name, age, gender, address, staffId, position, salary);
        this.courseBeingOffered = courseBeingOffered;
    }

    public String getCourseBeingOffered() {
        return courseBeingOffered;
    }

    public void setCourseBeingOffered(String courseBeingOffered) {
        this.courseBeingOffered = courseBeingOffered;
    }
}

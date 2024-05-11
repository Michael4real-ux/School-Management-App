package com.damilola.schoolmodel;

public class Teacher extends Staff {
    private String courseBeingHandled;

    public Teacher(String name, int age, String gender, String address, int staffId, String position, double salary, String courseBeingHandled) {
        super(name, age, gender, address, staffId, position, salary);
        this.courseBeingHandled = courseBeingHandled;
    }

    public String getCourseBeingHandled() {
        return courseBeingHandled;
    }

    public void setCourseBeingHandled(String courseBeingHandled) {
        this.courseBeingHandled = courseBeingHandled;
    }
}

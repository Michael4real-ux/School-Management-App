package com.damilola.schoolmodel;

import java.util.ArrayList;
import java.util.List;

public class School {
    private final String schoolName = "Decagon Institute";
    private final String schoolAddress = "Orchid hotel road";
    public List<Staff> listOfStaffs = new ArrayList<>();
    public List<Teacher> listOfTeachers = new ArrayList<>();
    public List<Student> listOfStudents = new ArrayList<>();

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }
}

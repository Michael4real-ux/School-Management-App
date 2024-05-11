package com.damilola.schoolmodel;

public class NonAcademicStaff extends Staff {

    public NonAcademicStaff(int staffId, String name, int age, String gender, String address, String position, double salary) {
        super(name, age, gender, address, staffId, position, salary);
    }
}

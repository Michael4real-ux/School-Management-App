package com.damilola.schoolmodel;

import com.damilola.services.PrincipalDuties;

import java.util.List;

public class Principal extends Staff implements PrincipalDuties {
    public Principal(String name, int age, String gender, String address, int staffId, String position, double salary) {
        super(name, age, gender, address, staffId, position, salary);
    }

    @Override
    public void admitNewStudent(Applicant applicant, List<Student> listOfStudents) {
        // Admitting applicants based on age
        if(applicant.getApplicantAge() >= 14){

        }
    }

    @Override
    public void expelStudent(Student student, List<Student> listOfStudents) {

    }
}

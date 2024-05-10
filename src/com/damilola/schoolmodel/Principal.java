package com.damilola.schoolmodel;

import com.damilola.exception.NotQualifiedException;
import com.damilola.services.PrincipalDuties;

import java.util.List;

public class Principal extends Staff implements PrincipalDuties {
    School school = new School();
    public Principal(String name, int age, String gender, String address, int staffId, String position, double salary) {
        super(name, age, gender, address, staffId, position, salary);
    }

    @Override
    public void admitNewStudent(Applicant applicant, List<Student> listOfStudents) throws  NotQualifiedException {
        // Admitting applicants based on age
        if(applicant.getApplicantAge() >= 14){
            System.out.println("Congratulations! " + applicant.getApplicantName() + ", you have been admitted into "+ school.getSchoolName() +
               ". Your class is " + applicant.getApplicantLevel());
        }
        throw new NotQualifiedException("Not Qualified!");
    }

    @Override
    public void expelStudent(Student student, List<Student> listOfStudents) {
       listOfStudents.remove(student);
    }
}

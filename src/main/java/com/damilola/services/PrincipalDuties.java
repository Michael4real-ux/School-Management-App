package com.damilola.services;

import com.damilola.exception.NotQualifiedException;
import com.damilola.schoolmodel.Applicant;
import com.damilola.schoolmodel.Student;

import java.util.List;

public interface PrincipalDuties {
    void admitNewStudent(Applicant applicant, List<Student> listOfStudents) throws NotQualifiedException;
    void expelStudent(Student student, List<Student> listOfStudents);
}

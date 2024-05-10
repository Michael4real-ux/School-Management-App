package com.damilola.services;

import com.damilola.schoolmodel.Student;

import java.util.List;

public interface PrincipalDuties {
    void admitNewStudent(List<Student> listOfStudents);
    void expelStudent(Student student, List<Student> listOfStudents);
}

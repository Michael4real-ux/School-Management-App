package com.damilola.schoolmodel;

import com.damilola.exception.NotQualifiedException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    @Test
    void admitNewStudent() throws NotQualifiedException {
        Principal principal = new Principal(1,"Innocent", 30, "Male","Onitsha, Anambra State",
                "Principal", 30000);
        List<Student> listOfStudents = new ArrayList<>();
        Student student1 = new Student(1,"Naomi", 18, "Female","Benin, Edo State",  "SS3");
        Student student2 = new Student(2,"Chizzy", 17, "Female","Benin, Edo State",  "SS3");
        Student student3 = new Student(3,"Juliet", 18, "Female","Benin, Edo State",  "SS3");
        Student student4 = new Student(4,"John", 16, "Female","Ogun State",  "SS2");
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
        Applicant david = new Applicant("David", 19, "Male","Imo State", "SS2");
        Applicant peter = new Applicant("Peter", 12, "Male","Lagos State", "SS2");

        principal.admitNewStudent(david, listOfStudents);
        assertEquals(5, listOfStudents.size());
        assertEquals(david.getApplicantName(), listOfStudents.get(4).getName());
    }

    @Test
    void expelStudent() {
        Principal principal = new Principal(1,"Innocent", 30, "Male","Onitsha, Anambra State",
                "Principal", 30000);
        List<Student> listOfStudents = new ArrayList<>();
        Student student1 = new Student(1,"Naomi", 18, "Female","Benin, Edo State",  "SS3");
        Student student2 = new Student(2,"Chizzy", 17, "Female","Benin, Edo State",  "SS3");
        Student student3 = new Student(3,"Juliet", 18, "Female","Benin, Edo State",  "SS3");
        Student student4 = new Student(4,"John", 16, "Female","Ogun State",  "SS2");
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);

        principal.expelStudent(student1, listOfStudents);
        assertEquals(3, listOfStudents.size());
    }
}
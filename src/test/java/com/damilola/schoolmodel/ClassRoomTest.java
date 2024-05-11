package com.damilola.schoolmodel;

import com.damilola.exception.WrongClassException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    @Test
    void teacherTeachingInClass() throws WrongClassException {
        Teacher teacher1 = new Teacher(2,"Richard", 30, "Male","Ughelli, Delta State",
                "Teacher",20000, "English");
        Teacher teacher2 = new Teacher(3,"Paul", 29, "Male","Warri, Delta State",
                "Teacher", 20000, "Mathematics");
        Teacher teacher3 = new Teacher(4,"Nengi", 28, "Female","Umuahia, Abia State",
                "Teacher", 18000, "Physics");
        ClassRoom classRoom1 = new ClassRoom("SS3");
        ClassRoom classRoom2 = new ClassRoom("SS2");
        Course course1 = new Course(1, "English");
        Course course2 = new Course(2, "Mathematics");
        Course course3 = new Course(3, "Physics");

        classRoom2.teacherTeachingInClass(course3, teacher3, classRoom2);
        assertEquals(course3.getCourseName(),  teacher3.getCourseBeingHandled());
    }

    @Test
    void studentAttendingClass() throws WrongClassException  {
        ClassRoom classRoom1 = new ClassRoom("SS3");
        ClassRoom classRoom2 = new ClassRoom("SS2");
        Course course1 = new Course(1, "English");
        Course course2 = new Course(2, "Mathematics");
        Course course3 = new Course(3, "Physics");
        Student student1 = new Student(1,"Naomi", 18, "Female","Benin, Edo State",  "SS3");
        Student student2 = new Student(2,"Chizzy", 17, "Female","Benin, Edo State",  "SS3");
        Student student3 = new Student(3,"Juliet", 18, "Female","Benin, Edo State",  "SS3");
        Student student4 = new Student(4,"John", 16, "Female","Ogun State",  "SS2");

        classRoom1.studentAttendingClass(course3, student2, classRoom1);
        assertEquals(classRoom1.getClassName(), student2.getStudentLevel());
    }
}
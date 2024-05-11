package com.damilola;

import com.damilola.exception.NotQualifiedException;
import com.damilola.exception.WrongClassException;
import com.damilola.schoolmodel.*;

public class Main {

    public static void main(String[] args) throws NotQualifiedException, WrongClassException {
      // Running the program

        // School
        School school = new School();
        System.out.println("School name: " + school.getSchoolName());
        System.out.println("School Address: " + school.getSchoolAddress());

        // Principal
        Principal principal = new Principal(1,"Damilola", 35, "Male", "Buena vista estate", "Principal", 30000);

        // Teachers
        Teacher teacher1 = new Teacher(2,"Richard", 30, "Male","Ughelli, Delta State",
                "Teacher",20000, "English");
        Teacher teacher2 = new Teacher(3,"Paul", 29, "Male","Warri, Delta State",
                "Teacher", 20000, "Mathematics");
        Teacher teacher3 = new Teacher(4,"Nengi", 28, "Female","Umuahia, Abia State",
                "Teacher", 18000, "Physics");

        // Non-Academic staff
        NonAcademicStaff staff1 = new NonAcademicStaff(5,"Lizzy", 45, "Female","Edo State",  "Cleaner", 10000);

        // Students
        Student student1 = new Student(1,"Naomi", 18, "Female","Benin, Edo State",  "SS3");
        Student student2 = new Student(2,"Chizzy", 17, "Female","Benin, Edo State",  "SS3");
        Student student3 = new Student(3,"Juliet", 18, "Female","Benin, Edo State",  "SS3");
        Student student4 = new Student(4,"John", 16, "Female","Ogun State",  "SS2");

        // Classnames
        ClassRoom classRoom1 = new ClassRoom("SS3");
        ClassRoom classRoom2 = new ClassRoom("SS2");

        // Courses
        Course course1 = new Course(1, "English");
        Course course2 = new Course(2, "Mathematics");
        Course course3 = new Course(3, "Physics");

        school.listOfCourses.add(course1);
        school.listOfCourses.add(course2);
        school.listOfCourses.add(course3);

        school.listOfStaffs.add(principal);
        school.listOfStaffs.add(teacher1);
        school.listOfStaffs.add(teacher2);
        school.listOfStaffs.add(teacher3);
        school.listOfStaffs.add(staff1);

        school.listOfTeachers.add(teacher1);
        school.listOfTeachers.add(teacher2);
        school.listOfTeachers.add(teacher3);

        school.listOfStudents.add(student1);
        school.listOfStudents.add(student2);
        school.listOfStudents.add(student3);
        school.listOfStudents.add(student4);


        classRoom2.teacherTeachingInClass(course3, teacher3, classRoom2);
        try {
            classRoom1.teacherTeachingInClass(course1, teacher2, classRoom1);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
            System.out.println("Sorry, this is not your period yet.");
        }
        classRoom2.studentAttendingClass(course3, student4, classRoom2);
        try {
            classRoom1.studentAttendingClass(course1, student4, classRoom1);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
            System.out.println("Sorry, this is not your class, kindly locate your class.");
        }

        System.out.println("List of students in the school before admitting new students: \n" + school.listOfStudents);

        Applicant david = new Applicant("David", 19, "Male","Imo State", "SS2");
        Applicant peter = new Applicant("Peter", 12, "Male","Lagos State", "SS2");

        principal.admitNewStudent(david, school.listOfStudents);
        try {
            principal.admitNewStudent(peter, school.listOfStudents);
        } catch (Exception e){
            System.out.println("Exception occurred: " +e);
            System.out.println("Sorry "+peter.getApplicantName()+ ", good luck next time.");
        }
        System.out.println("List of students in the school after admitting new student: \n" + school.listOfStudents);

        principal.expelStudent(student1, school.listOfStudents);
        System.out.println("List of students in the school after expelling a student: \n" + school.listOfStudents);
    }

}
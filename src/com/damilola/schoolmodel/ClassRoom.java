package com.damilola.schoolmodel;

import com.damilola.exception.WrongClassException;

public class ClassRoom {
    private String className;

    public ClassRoom(String className) {
        this.className = className;
    }

    public String getClassName(){
        return className;
    }

    public void setClassName(String className){
        this.className = className;
    }

    public void teacherTeachingInClass(Course course, Teacher teacher, ClassRoom classRoom) throws WrongClassException {
        /*
        - I assume that there is a timetable for different courses to follow.
        - The method checks if the teacher in the class is handling the same course in the timetable
        * */
       if(course.getCourseName().equals(teacher.getCourseBeingHandled())){
           System.out.println(course.getCourseName() + " teacher is currently teaching in " + classRoom.getClassName() + " class.");
       }
       throw  new WrongClassException("You are in the wrong class");
    }

    public void studentAttendingClass(Course course, Student student, ClassRoom classRoom) throws WrongClassException{
        /*
           - The method checks if a student is eligible to attend class in the appropriate classroom
              based on the student level
        */

        if(student.getStudentLevel().equals(classRoom.getClassName())){
            System.out.println(student.getName() + " is in attendance for " + course.getCourseName() +
                    " lessons in " + classRoom.getClassName() + " class");
        }
    }
}

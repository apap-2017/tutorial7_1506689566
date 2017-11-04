package com.example.service;

import java.util.List;

import com.example.model.CourseModel;
import com.example.model.StudentModel;

public interface StudentService
{
    StudentModel selectStudent (String npm);


    List<StudentModel> selectAllStudents ();
    
    List<CourseModel> selectCourses();


    void addStudent (StudentModel student);


    void deleteStudent (String npm);
    
    void updateStudent (StudentModel student);
    
    
    CourseModel selectCourse (String id_course);
    
    List<CourseModel> selectAllCourses ();
    
    List<CourseModel> selectCoursesAll ();
 

	List<StudentModel> selectStudentCourses(String id_course);
}

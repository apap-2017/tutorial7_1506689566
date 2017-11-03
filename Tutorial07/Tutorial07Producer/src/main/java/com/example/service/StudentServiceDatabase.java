package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentMapper;
import com.example.model.StudentModel;
import com.example.model.CourseModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentServiceDatabase implements StudentService
{
    @Autowired
    private StudentMapper studentMapper;


    @Override
    public StudentModel selectStudent (String npm)
    {
        log.info ("select student with npm {}", npm);
        return studentMapper.selectStudent (npm);
    }
    
    @Override
    public CourseModel selectCourse (String id_course)
    {
        log.info ("select course with id {}", id_course);
        return studentMapper.selectCourse(id_course);
    }
    
    @Override
    public List<CourseModel> selectAllCourses ()
    {
        log.info ("select all courses");
        return studentMapper.selectAllCourses ();
    }
    
    @Override
    public List<CourseModel> selectCourses ()
    {
        log.info ("select all courses");
        return studentMapper.selectCourses ();
    }
    
    @Override
    public List<StudentModel> selectStudentCourses ()
    {
        log.info ("select all courses and students");
        return studentMapper.selectStudentCourses();
    }


    @Override
    public List<StudentModel> selectAllStudents ()
    {
        log.info ("select all students");
        return studentMapper.selectAllStudents ();
    }


    @Override
    public void addStudent (StudentModel student)
    {
        studentMapper.addStudent (student);
    }


    @Override
    public void deleteStudent (String npm)
    {
    	log.info ("student" + npm + "deleted");
    	studentMapper.deleteStudent(npm);
    }
    
    @Override
    public void updateStudent (StudentModel student)
    {
    	log.info ("student" + student.getNpm() + "updated");
    	studentMapper.updateStudent(student);
    }

}

package com.jsp.spring_mvc.studentdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring_mvc.studentdb.entity.Student;
import com.jsp.spring_mvc.studentdb.repository.StudentRepository;
@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public ModelAndView addStudent(Student student)
	{
		//In begiining the request goes to the front controller it cannot allone handle it so it uses adapter it
		//it scheckks the clss details that is the controller cls.....
	
		studentRepository.addStudent(student);
		//trigger back to index.jsp
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index.jsp");
		
		return mav;
	}


	public ModelAndView displayStudent() {
		// TODO Auto-generated method stub
		List<Student> student=studentRepository.displayStudent();
		//trigger back to index.jsp
		ModelAndView mav=new ModelAndView();
		mav.setViewName("display-student-view.jsp");
		mav.addObject("studentList",student);
		return mav;
	}


	public ModelAndView findStudentById(int studentId) {
		Student student=studentRepository.findStudentById(studentId);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("UpdateStudent.jsp");
		mav.addObject("Students", student);
		
		return mav;
	}


	public ModelAndView updateInsert(Student s) {
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("UpdateStudent.jsp");
		
		
		return mav;
	}

}

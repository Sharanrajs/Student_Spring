package com.jsp.spring_mvc.studentdb.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jsp.spring_mvc.studentdb.entity.Student;
@Repository
public class StudentRepository {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql-config");

	public void addStudent(Student student)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		em.persist(student);
		et.commit();
		em.close();
	}
	public List<Student> displayStudent()
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		Query query=em.createQuery("FROM Student");
		List<Student> students=query.getResultList();
		
		
		et.commit();
		em.close();
		return students;
	}
	public Student findStudentById(int studentId) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
	
		Student student=em.find(Student.class, studentId);
		
		et.commit();
		em.close();
		return student;
	}
		
		

}

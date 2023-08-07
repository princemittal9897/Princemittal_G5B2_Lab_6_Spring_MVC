package com.greatlearning.studentregistration.service;

import java.util.List;

import com.greatlearning.studentregistration.model.Student;

public interface StudentService {

	Student createStudent(Student student);
	List<Student> getAllStudents();
	Student getStudentById(long id);
	Student updateStudent(Student student,long id);
	void deleteStudent(long id);
}

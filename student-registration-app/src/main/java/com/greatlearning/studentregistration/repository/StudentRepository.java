package com.greatlearning.studentregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentregistration.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

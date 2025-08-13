package com.smartstudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartstudent.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {}

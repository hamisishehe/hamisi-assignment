package com.example.hamisiassignment.Repository;

import com.example.hamisiassignment.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {

    Optional<Student> findStudentById(Long id);
}

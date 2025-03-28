package com.example.hamisiassignment.Service;

import com.example.hamisiassignment.Models.Student;
import com.example.hamisiassignment.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServices {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveData(String firstname, String lastname, String program){

        Student student = new Student();

        student.setFirstName(firstname);
        student.setLastName(lastname);
        student.setProgram(program);

        return studentRepository.save(student);

    }

    public List<Student> getall(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id){

        return studentRepository.findStudentById(id);
    }
}

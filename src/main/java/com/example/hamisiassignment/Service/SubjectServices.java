package com.example.hamisiassignment.Service;

import com.example.hamisiassignment.Models.Student;
import com.example.hamisiassignment.Models.Subject;
import com.example.hamisiassignment.Repository.StudentRepository;
import com.example.hamisiassignment.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubjectServices {

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private StudentRepository studentRepository;


    public Subject saveData(Long id, String code, String name, Integer year){

        Optional<Student> student = studentRepository.findStudentById(id);

        if (student.isPresent()){

            Subject subject = new Subject();
            subject.setCode(code);
            subject.setName(name);
            subject.setYear(year);
            subject.setStudent(student.get());
            return subjectRepository.save(subject);
        }
        else {
            throw new RuntimeException();
        }

    }

}

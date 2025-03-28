package com.example.hamisiassignment.Controller;

import com.example.hamisiassignment.Models.Student;
import com.example.hamisiassignment.Service.StudentServices;
import com.example.hamisiassignment.Service.SubjectServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentServices studentServices;


    @PostMapping("/student/saveData")
    public Student saveData(
            @RequestParam String firstname,
            @RequestParam String lastname,
            @RequestParam String program

    ){
        return studentServices.saveData(firstname,lastname,program);
    }

    @GetMapping("/student/getAll")
    public List<Student> getAll(){
        return studentServices.getall();
    }


    @GetMapping("/student/{id}")
    public Optional<Student> getAll(@PathVariable Long id){
        return studentServices.getStudentById(id);
    }


}

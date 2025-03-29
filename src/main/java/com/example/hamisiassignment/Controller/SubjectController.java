package com.example.hamisiassignment.Controller;


import com.example.hamisiassignment.Models.Subject;
import com.example.hamisiassignment.Service.StudentServices;
import com.example.hamisiassignment.Service.SubjectServices;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Tag(name = "Students Management", description = "APIs for managing Students")
public class SubjectController {

    @Autowired
    private SubjectServices subjectServices;



    @PostMapping("/subject/saveData")
    public Subject saveData(@RequestParam String code,
                            @RequestParam String name,
                            @RequestParam Integer year,
                            @RequestParam Long id){


        return subjectServices.saveData(id,code,name,year);

    }

}

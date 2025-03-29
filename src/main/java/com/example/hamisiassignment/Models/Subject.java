package com.example.hamisiassignment.Models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String code;

    private String name;

    private Integer year;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @JsonBackReference
    private Student student;



}

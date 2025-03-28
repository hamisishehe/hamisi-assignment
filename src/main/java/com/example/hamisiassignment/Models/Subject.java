package com.example.hamisiassignment.Models;


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
    private Student student;



}

package com.example.librarymanagementsystem.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student") // if we do not define table name the default name will be class name
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    private Integer studentRollNo;
    private String name;
    private String branch;
    private double cgpa;
    private String phoneNo;

}

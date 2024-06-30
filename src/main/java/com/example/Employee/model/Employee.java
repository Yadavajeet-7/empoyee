package com.example.Employee.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DemoEmployee1")
@Data
public class Employee {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}

package com.example.EmployeePayrollApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  // Marks this class as a database entity
@Table(name = "employees")  // Specifies the table name
@Data  // Generates getters, setters, toString, equals, and hashCode
@AllArgsConstructor  // Generates constructor with all fields
@NoArgsConstructor  // Generates a no-argument constructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increments ID
    private Long id;

    private String name;
    private String department;
    private double salary;
}
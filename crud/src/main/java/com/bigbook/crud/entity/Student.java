package com.bigbook.crud.entity;

import jakarta.persistence.*;
import lombok.Data;
import com.bigbook.crud.entity.Student;

@Data
@Entity // Anotación faltante
@Table(name = "tbl_student")
public class Student {

    @Id // Anotación faltante
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(name = "email_address", unique = true,nullable = false)
    private String email;
}

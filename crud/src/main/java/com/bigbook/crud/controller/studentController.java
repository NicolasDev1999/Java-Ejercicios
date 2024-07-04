package com.bigbook.crud.controller;

import com.bigbook.crud.entity.Student;
import com.bigbook.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class studentController {

    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student> getAll(){
        return studentService.getStudents();
    }
    @GetMapping("/{studentId}")
    public Optional<Student> getById(@PathVariable("studentId") Long studentId){
        return studentService.getStudents(studentId);
    }
    @PostMapping
    public void saveUpDate(@RequestBody Student student){
         studentService.saveOrUpDate(student);
    }

    @DeleteMapping("/{studentId}")
    public void saveUpDate(@PathVariable("studentId") Long studentId){
         studentService.delet(studentId);
    }


}

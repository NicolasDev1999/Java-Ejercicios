package com.bigbook.crud.service;

import com.bigbook.crud.entity.Student;
import com.bigbook.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudents(Long id){
        return studentRepository.findById(id);
    }

    public void saveOrUpDate(Student student){
        studentRepository.save(student);
    }

    public void delet(Long id){
        studentRepository.deleteById(id);
    }
}

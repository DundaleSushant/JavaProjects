package com.GirlsHostel.service;

import com.GirlsHostel.entity.Student;
import com.GirlsHostel.jpaRepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    public void deleteStudent(Long id){
         studentRepository.deleteById(id);
    }
}

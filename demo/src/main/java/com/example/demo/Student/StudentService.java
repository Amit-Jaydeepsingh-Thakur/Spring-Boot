package com.example.demo.Student;
import com.example.demo.Student.StudentRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {

        return studentRepository.findAll();
//        return List.of(
//                new Student(
//                        1L,
//                        "Amit",
//                        "amit@gmail.com",
//                        LocalDate.of(1999, Month.JULY, 7),
//                        21
//                )
//        );
    }
}

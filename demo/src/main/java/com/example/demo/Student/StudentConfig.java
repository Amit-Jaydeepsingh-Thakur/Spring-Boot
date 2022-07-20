package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository
    ) {
        return args -> {
            Student amit = new Student(
                        1L,
                        "Amit",
                        "amit@gmail.com",
                        LocalDate.of(1999, Month.JULY, 7),
                        21
                );

            Student sang = new Student(
                    1L,
                    "Sang",
                    "sang@gmail.com",
                    LocalDate.of(1999, Month.JULY, 7),
                    21
            );

            studentRepository.saveAll(
                    List.of(amit, sang)
            );
        };
    }
}

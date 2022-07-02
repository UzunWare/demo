package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student emre = new Student(
                    1L,
                    "Emre Korkmaz",
                    "emrekrkmzpk@gmail.com",
                    LocalDate.of(1997,3,1)
            );

            Student enes = new Student(
                    "Enes Korkmaz",
                    "eneskrkmzpk@gmail.com",
                    LocalDate.of(1998,8,9)
            );

            Student filiz = new Student(
                    "Filiz Korkmaz",
                    "filizkrkmzpk@gmail.com",
                    LocalDate.of(1987,5,12)
            );

            repository.saveAll(
                    List.of(emre, enes, filiz)
            );
        };
    }
}

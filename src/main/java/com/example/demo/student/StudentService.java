package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Emre Korkmaz", "emrekrkmzpk@gmail.com", LocalDate.of(1997,3,1), 25),
                new Student(2L, "Enes Korkmaz", "eneskrkmzpk@gmail.com", LocalDate.of(1998,8,9), 24),
                new Student(3L, "Filiz Korkmaz", "filizkrkmzpk@gmail.com", LocalDate.of(1989,11,23), 39),
                new Student(4L, "Nurten Korkmaz", "nurtenkrkmzpk@gmail.com", LocalDate.of(1987,4,11), 41),
                new Student(5L, "Yildiz Korkmaz", "yildizkrkmzpk@gmail.com", LocalDate.of(1986,6,21), 42)
        );
    }
}

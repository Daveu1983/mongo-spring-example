package com.example.springmongo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @GetMapping
    public List<Student> fetchAllStudents() {
        return studentService.getAllStudents();
    }

}

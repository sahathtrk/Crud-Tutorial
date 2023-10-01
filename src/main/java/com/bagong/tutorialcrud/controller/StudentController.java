package com.bagong.tutorialcrud.controller;

import com.bagong.tutorialcrud.dto.RequestStudent;
import com.bagong.tutorialcrud.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@Controller
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public void add(@RequestBody RequestStudent request) throws Exception {
        studentService.add(request);
    }
}

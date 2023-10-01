package com.bagong.tutorialcrud.controller;

import com.bagong.tutorialcrud.dto.RequestClass;
import com.bagong.tutorialcrud.model.Class;
import com.bagong.tutorialcrud.service.ClassService;
import com.bagong.tutorialcrud.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/class")
public class ClassController {

    private final ClassService classService;
    private final StudentService studentService;

    public ClassController(ClassService classService, StudentService studentService) {
        this.classService = classService;
        this.studentService = studentService;
    }

    @GetMapping("")
    public ResponseEntity<List<Class>> getAllClass(){
        return new ResponseEntity<>(classService.getAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public void createClass(@RequestBody RequestClass request){
        classService.create(request);
    }

}

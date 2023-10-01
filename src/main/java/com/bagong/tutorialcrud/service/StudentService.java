package com.bagong.tutorialcrud.service;

import com.bagong.tutorialcrud.dto.RequestStudent;
import com.bagong.tutorialcrud.model.Class;
import com.bagong.tutorialcrud.model.Student;
import com.bagong.tutorialcrud.repository.ClassRepository;
import com.bagong.tutorialcrud.repository.StudentRepository;
import com.bagong.tutorialcrud.utils.DateUtils;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final ClassRepository classRepository;
    private final DateUtils dateUtils;

    public StudentService(StudentRepository studentRepository, ClassRepository classRepository, DateUtils dateUtils) {
        this.studentRepository = studentRepository;
        this.classRepository = classRepository;
        this.dateUtils = dateUtils;
    }


    public void add(RequestStudent request) throws Exception {

        Optional<Class> classOptional = classRepository.findByName(request.getClassName());

        if(!classOptional.isPresent()){
            throw new Exception("class not found");
        }

        Student student = new Student(request.getName(),
                dateUtils.convertDateToLocalDate(request.getDateOfBirth()),
                request.getGender());
        student = studentRepository.save(student);

        Class c = classOptional.get();

        c.addStudent(student);

        classRepository.save(c);
    }
}

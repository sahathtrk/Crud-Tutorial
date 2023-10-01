package com.bagong.tutorialcrud.service;

import com.bagong.tutorialcrud.dto.RequestClass;
import com.bagong.tutorialcrud.model.Class;
import com.bagong.tutorialcrud.repository.ClassRepository;
import org.springframework.http.ProblemDetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    private final ClassRepository classRepository;

    public ClassService(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    public List<Class> getAll() {
        return classRepository.findAll();
    }

   public void create(RequestClass request){
        Class newClass = new Class(request.getName());
        newClass = classRepository.save(newClass);

       System.out.println(newClass.getId());
   }
}

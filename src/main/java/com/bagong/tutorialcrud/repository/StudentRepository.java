package com.bagong.tutorialcrud.repository;

import com.bagong.tutorialcrud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

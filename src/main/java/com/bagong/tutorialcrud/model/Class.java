package com.bagong.tutorialcrud.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="class")
public class Class {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany()
    private List<Student> students;

    public Class(String name) {
        this.name = name;
    }

    public Class() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }
}

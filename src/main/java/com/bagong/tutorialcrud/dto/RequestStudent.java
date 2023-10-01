package com.bagong.tutorialcrud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RequestStudent {
    private String name;
    @JsonProperty("date_of_birth")
    private String dateOfBirth;
    private String gender;

    @JsonProperty("class_name")
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public RequestStudent() {
    }

    public RequestStudent(String name, String dateOfBirth, String gender, String className) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

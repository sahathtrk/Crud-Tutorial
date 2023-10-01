package com.bagong.tutorialcrud.dto;

import lombok.Data;

@Data
public class RequestClass {
    private String name;

    public RequestClass() {
    }

    public RequestClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

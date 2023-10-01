package com.bagong.tutorialcrud.repository;

import com.bagong.tutorialcrud.model.Class;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClassRepository extends JpaRepository<Class, Long> {

    Optional<Class> findByName(String name);

}

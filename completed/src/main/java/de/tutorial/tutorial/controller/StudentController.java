package de.tutorial.tutorial.controller;

import de.tutorial.tutorial.model.Student;
import de.tutorial.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repository;

    @GetMapping(path = "/all")
    public List<Student> all() {
        return repository.findAll();
    }

}

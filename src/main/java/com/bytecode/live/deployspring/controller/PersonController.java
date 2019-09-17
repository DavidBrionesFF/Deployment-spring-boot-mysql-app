package com.bytecode.live.deployspring.controller;

import com.bytecode.live.deployspring.model.Person;
import com.bytecode.live.deployspring.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonRepository repository;

    @GetMapping("/all")
    public Page<Person> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }

    @GetMapping("/{id}")
    public Optional<Person> findById(@PathVariable long idPerson){
        return repository.findById(idPerson);
    }

    @PostMapping
    public Person save(@RequestBody Person person){
        return repository.save(person);
    }
}

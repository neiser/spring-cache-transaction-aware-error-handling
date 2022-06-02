package com.example.demo;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DemoController {
    private final DemoRepository repository;

    public DemoController(DemoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public String doSomething() {
        return repository.doSomething();
    }
}

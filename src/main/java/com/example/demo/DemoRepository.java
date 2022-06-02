package com.example.demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class DemoRepository {
    @Cacheable("testCache")
    public String doSomething() {
        return "Value!";
    }
}

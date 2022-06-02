package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThatCode;

@SpringBootTest
@TestPropertySource(properties = "makeRedisTransactionAware=false")
class TestWithoutTransactionAwareness {

    @Autowired
    private DemoController demoController;

    @Test
    void doSomething() {
        assertThatCode(demoController::doSomething).doesNotThrowAnyException();
    }

}

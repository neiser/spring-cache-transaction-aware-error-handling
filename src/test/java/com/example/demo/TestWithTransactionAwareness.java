package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThatCode;

@SpringBootTest
class TestWithTransactionAwareness {

	@Autowired
	private DemoController demoController;

	@Test
	void doSomething() {
		assertThatCode(demoController::doSomething).doesNotThrowAnyException();
	}

}

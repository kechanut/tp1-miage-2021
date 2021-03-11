package com.acme.todolist;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.acme.todolist.configuration.TodolistApplication;
import com.acme.todolist.domain.TodoItem;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest(classes = TodolistApplication.class)
class TodolistApplicationTests {

	
	
	@Test
	void IsLate() {
		TodoItem todoItem = new TodoItem("1", Instant.now().minus(24, ChronoUnit.HOURS), "Body");
		assertThat(todoItem.finalContent(), todoItem.isLate(),is(true));
	}

}

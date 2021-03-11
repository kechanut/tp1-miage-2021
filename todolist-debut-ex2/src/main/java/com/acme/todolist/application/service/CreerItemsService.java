package com.acme.todolist.application.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.acme.todolist.application.port.in.GetTodoItems;
import com.acme.todolist.application.port.out.LoadTodoItem;
import com.acme.todolist.application.port.out.UpdateTodoItem;
import com.acme.todolist.domain.TodoItem;

@Component
public class CreerItemsService implements GetTodoItems {

	private UpdateTodoItem updateTodoItem;

	@Inject
	public CreerItemsService(UpdateTodoItem updateTodoItem) {
		this.updateTodoItem = updateTodoItem;

	}
/*
	@Override
	public void ajouterItem(TodoItem item) {
		this.updateTodoItem
	}
*/

	@Override
	public List<TodoItem> getAllTodoItems() {
		// TODO Auto-generated method stub
		return null;
	}
}

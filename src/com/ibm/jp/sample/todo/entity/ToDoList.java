package com.ibm.jp.sample.todo.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@Named("todos")
public class ToDoList {
	private List<ToDoEntry> toDoList;

	public ToDoList() {
		toDoList = new ArrayList<>();
	}
	
	public List<ToDoEntry> getList() {
		return Collections.unmodifiableList(toDoList);
	}
	
	public void addSchedule(ToDoEntry newEntry) {
		toDoList.add(newEntry);
	}
	
	public void removeSchedule(String id) {
		Iterator<ToDoEntry>it = toDoList.iterator();
		while (it.hasNext()) {
			ToDoEntry entry = it.next();
			if (entry.getId().equals(id)) {
				it.remove();
			}
		}
	}
	
}

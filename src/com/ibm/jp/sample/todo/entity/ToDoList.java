package com.ibm.jp.sample.todo.entity;

import java.util.ArrayList;
import java.util.Iterator;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named("todolist")
public class ToDoList extends ArrayList<ToDoEntry> {

	public ToDoList() {
	}
	
	public void removeSchedule(String id) {
		Iterator<ToDoEntry>it = this.iterator();
		while (it.hasNext()) {
			ToDoEntry entry = it.next();
			if (entry.getId().equals(id)) {
				it.remove();
			}
		}
	}
	
}

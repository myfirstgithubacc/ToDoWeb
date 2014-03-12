package com.ibm.jp.sample.todo.entity;

import java.io.Serializable;

public class ToDoEntry implements Serializable {

	private String id;
	private String title;
	private String detail;
	
	public ToDoEntry(String id, String title, String detail) {
		if (id == null) {
			throw new NullPointerException("ToDoEntry: id is null");
		}
		this.id = id;
		this.title = title;
		this.detail = detail;
	}
	public String getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getDetail() {
		return detail;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ToDoEntry) {
			ToDoEntry other = (ToDoEntry) obj;
			return this.id.equals(other.id);
		} else {
			return false;
		}
	}
}

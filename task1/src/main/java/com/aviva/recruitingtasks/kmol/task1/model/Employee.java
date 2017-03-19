package com.aviva.recruitingtasks.kmol.task1.model;

import java.util.Objects;

public class Employee {

	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee employee = (Employee) obj;
		return Objects.equals(name, employee.name);

	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return this.name;
	}

}

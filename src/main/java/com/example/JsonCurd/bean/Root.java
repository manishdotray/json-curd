package com.example.JsonCurd.bean;

public class Root {

	public Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Root [employee=" + employee + "]";
	}
	
	
}

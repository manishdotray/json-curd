package com.example.JsonCurd.bean;

public class Employee {

	public String name;
    public int salary;
    public boolean married;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", married=" + married + "]";
	}
    
    
}

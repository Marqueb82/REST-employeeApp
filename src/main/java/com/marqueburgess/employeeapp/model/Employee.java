package com.marqueburgess.employeeapp.model;

public class Employee {

	private Integer employeeId;
	private String name;
	private Integer yearWorked;
	private Double salary;

	public Employee() {
	}

	public Employee(Integer employeeId, String name, Integer yearWorked, Double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.yearWorked = yearWorked;
		this.salary = salary;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYearWorked() {
		return yearWorked;
	}

	public void setYearWorked(Integer yearWorked) {
		this.yearWorked = yearWorked;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", yearWorked=" + yearWorked + ", salary="
				+ salary + "]";
	}

}
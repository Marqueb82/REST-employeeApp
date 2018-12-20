package com.marqueburgess.employeeapp.model;

public class Response {

	private Long id;
	private Employee emp;

	public Response(Long id, Employee emp) {
		this.id = id;
		this.emp = emp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Employee :" + id;
	}

}

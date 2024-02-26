package com.springe.mployeeservice.model;

public record Employee(Long id,Long departmentId, String name,int age,String position) {

	public Long id() {
		return id;
	}

	public Long departmentId() {
		return departmentId;
	}

	public String name() {
		return name;
	}

	public int age() {
		return age;
	}

	public String position() {
		return position;
	}
	
	
	

}

package com.axis.dto;

public class UserDto {
	
	private int id;
	private String name;
	private int age;
	private String contactNo;
	public UserDto() {
		super();
	}
	public UserDto(int id, String name, int age, String contactNo) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.contactNo = contactNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	
	

}

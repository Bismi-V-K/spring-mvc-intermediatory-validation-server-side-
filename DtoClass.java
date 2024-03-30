package com.spring.mvc.intermediate.validation.dtoClass;

import javax.validation.constraints.NotBlank;

public class DtoClass {

	@NotBlank(message = "* name cannot be blank")
	private String name;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "DtoClass [name=" + name + ", email=" + email + "]";
	}
}

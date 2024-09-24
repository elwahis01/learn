package com.sirius.tech.learn.dto;

public class AutorBasicDTO  implements IDTO {

	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String firstName;
	private String lastName;
	private String lastInstitution;

	
	
	
	@Override
	public Long getId() {
	 
		return this.id;
	}

	@Override
	public void setId(Long id) {
	  this.id=id;
		
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastInstitution() {
		return lastInstitution;
	}

	public void setLastInstitution(String lastInstitution) {
		this.lastInstitution = lastInstitution;
	}

}

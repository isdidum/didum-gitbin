package com.revature.dto;

import java.sql.Date;
import java.util.Objects;

/*
 * Adhering to Java Bean Conventions
 * 1. No-Args constructor
 * 2. All-Args constructor
 * 3. All-private instance variables (OOP encapsulation) to preserve the integrity of class
 * 4. Access instance variables with getters/setters
 * 5. Must implements Serializable interface
 * 6. step-A is equivalent step-B
 * 
 * DTO (Data Transfer Object): an object that contains properties, getters/setters
 * possibly overrides equals + hashCode and toString
 * AddorUpdateStudentDTO = StudentDTO
 */
public class StudentDTO {
	
	//This DTO does not have an ID, because to add a new student or to update a previous already existing student,
	//we only need core properties
	private String firstName;
	private String lastName;
	private String classify;
	private int age;
	private Date entryDate;
	
	//No-Args constructor
	public StudentDTO() {}
	
	//parameterized constructor
	public StudentDTO(String fName, String lName, String classify, int age, Date date) {
		super(); //not necessary, as it's called implicitly
		//this();
		this.firstName = fName;
		this.lastName = lName;
		this.classify = classify;
		this.age = age;
		this.entryDate = date;
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

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, classify, entryDate, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDTO other = (StudentDTO) obj;
		return age == other.age && Objects.equals(classify, other.classify)
				&& Objects.equals(entryDate, other.entryDate) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "StudentDTO [firstName=" + firstName + ", lastName=" + lastName + ", classify=" + classify
				+ ", age=" + age + ", entryDate=" + entryDate + "]";
	}	
	
}

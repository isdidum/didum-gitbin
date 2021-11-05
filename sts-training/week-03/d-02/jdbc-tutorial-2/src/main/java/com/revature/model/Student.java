package com.revature.model;

import java.sql.Date;
import java.util.Objects;

//import java.util.Date;

/*
 * Adhering to Java Bean Conventions
 * 1. No-Args constructor
 * 2. All-Args constructor
 * 3. All-private instance variables (OOP encapsulation) to preserve the integrity of class
 * 4. Access instance variables with getters/setters
 * 5. Must implements Serializable interface
 * 6. step-A is equivalent step-B
 */
@SuppressWarnings("serial")
public class Student extends Object implements java.io.Serializable { // step-A
//public class Student implements java.io.Serializable { //step-B
	private int id;
	private String firstName;
	private String lastName;
	private String classify;
	private int age;
	private Date entryDate;
	//private String entryDate;
	
	public Student() {
		//this super() invocation is not necessary since by default Student extends Object
		//but I leave it here for visualization purposes
		super(); //not necessary, as it's called implicitly
	}
	
	//public Student(int id, String fName, String lName, String classify, int age, String date) {
	public Student(int id, String fName, String lName, String classify, int age, Date date) {
		super(); //not necessary, as it's called implicitly
		//this();
		this.id = id;
		this.firstName = fName;
		this.lastName = lName;
		this.classify = classify;
		this.age = age;
		this.entryDate = date;
	}
	
	/*public Student(int id, String fName, String lName, String classify, int age, java.util.Date date) {
		super(); //not necessary, as it's called implicitly
		//this();
		this.id = id;
		this.firstName = fName;
		this.lastName = lName;
		this.classify = classify;
		this.age = age;
		this.entryDate = (Date) date;
	}*/

	//generate getters/setter: right-click -> Source -> Generate Getters & Setters -> Select All -> ok
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	//public void setEntryDate(String date) {
	public void setEntryDate(Date date) {
		this.entryDate = date; 
	}
	
	//public String getEntryDate() {
	public Date getEntryDate() {
		return this.entryDate;
	}
	
	/*
	 * Object class methods: override toString(), equals(), hashCode()
	 * generate Object methods: right-click -> Source -> Generate hasCode() & equals() -> Select All -> ok
	 */
	@Override
	public int hashCode() {
		return Objects.hash(age, classify, entryDate, firstName, id, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Student other = (Student) obj;
		return age == other.age && Objects.equals(classify, other.classify) && Objects.equals(entryDate, other.entryDate)
				&& Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(lastName, other.lastName);
	}
	
	/*
	 * generate Object methods: right-click -> Source -> Generate toString() -> Select All variables only -> ok
	 * Without overriding this toString() method, you'd get:
	 * 1. Name of class
	 * 2. Memory address of object
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", classify=" + classify
				+ ", age=" + age + ", entryDate=" + entryDate + "]";
	}	
}

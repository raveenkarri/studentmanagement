package com.Raveen.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
   
	private int classNo;
	
	private int rollNo;
	
	private String firstName;
	private String lastName;
	@Id
	private int admissionNo;
	private Date date;
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	public int getAdmissionNo() {
		return admissionNo;
	}
	public void setAdmissionNo(int admissionNo) {
		this.admissionNo = admissionNo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Student(int classNo, int rollNo, String firstName, String lastName, int admissionNo, Date date) {
		super();
		this.classNo = classNo;
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.admissionNo = admissionNo;
		this.date = date;
	}
	public Student() {
		super();
	}
	
	
}
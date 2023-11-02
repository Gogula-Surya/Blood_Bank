package com.jsp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Donor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String gender;
	private int age;
	private String bloodgroup;
	private String email;
	private String address;
	private String mobile;
	private String healthcondition;
	public Donor() {
		
	}
	public Donor(int id, String firstname, String gender, int age, String bloodgroup, String email, String address,
			String mobile, String healthcondition) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.gender = gender;
		this.age = age;
		this.bloodgroup = bloodgroup;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
		this.healthcondition = healthcondition;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getHealthcondition() {
		return healthcondition;
	}
	public void setHealthcondition(String healthcondition) {
		this.healthcondition = healthcondition;
	}
	@Override
	public String toString() {
		return "Donor [id=" + id + ", firstname=" + firstname + ", gender=" + gender + ", age=" + age + ", bloodgroup="
				+ bloodgroup + ", email=" + email + ", address=" + address + ", mobile=" + mobile + ", healthcondition="
				+ healthcondition + "]";
	}
	
	

}

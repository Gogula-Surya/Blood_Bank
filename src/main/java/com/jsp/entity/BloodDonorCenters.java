package com.jsp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BloodDonorCenters 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	private String centername;
	private String phonenumber;
	public BloodDonorCenters() {
		
	}
	public BloodDonorCenters(int id, String address, String centername, String phonenumber) {
		super();
		this.id = id;
		this.address = address;
		this.centername = centername;
		this.phonenumber = phonenumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCentername() {
		return centername;
	}
	public void setCentername(String centername) {
		this.centername = centername;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "BloodDonorCenters [id=" + id + ", address=" + address + ", centername=" + centername + ", phonenumber="
				+ phonenumber + "]";
	}
	
}

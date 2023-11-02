package com.jsp.dao;

import java.util.List;

import com.jsp.entity.Donor;

public interface DonorDao 
{
	public Donor insertValues(Donor donor);
	
	List<Donor> serachForDonors(String address, String bloodgroup);
}

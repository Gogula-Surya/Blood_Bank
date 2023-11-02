package com.jsp.daoimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.DonorDao;
import com.jsp.entity.Donor;
import com.jsp.repository.Donor_Repository;

@Component
public class DonorDaoImple implements DonorDao 
{
	@Autowired
	private Donor_Repository donor_Repository;
	
	// insert values 
	@Override
	public Donor insertValues(Donor donor) {
		return donor_Repository.save(donor);
	}

	//search for donors
	@Override
	public List<Donor> serachForDonors(String address, String bloodgroup) {
		return donor_Repository.findByAddressAndBloodgroup(address, bloodgroup);
	}

}

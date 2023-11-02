package com.jsp.dao;

import java.util.List;

import com.jsp.entity.BloodDonorCenters;

public interface BloodDonorCentersDao 
{
	List<BloodDonorCenters> findAddress(String address);
	
	List<BloodDonorCenters> findCenter(String center);
	
	List<BloodDonorCenters> findbycenterandaddress(String address,String center);
	
	// update delete BloodDonor Centers
	
	List<BloodDonorCenters> getAllCenters();
	
	BloodDonorCenters saveCenter(BloodDonorCenters centers);
	
	BloodDonorCenters updateCenter(BloodDonorCenters centers);
	
	BloodDonorCenters getCenter(int id);
	
	void deleteCenter(int id);
}

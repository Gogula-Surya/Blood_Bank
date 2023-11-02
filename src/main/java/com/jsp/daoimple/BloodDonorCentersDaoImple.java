package com.jsp.daoimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.BloodDonorCentersDao;
import com.jsp.entity.BloodDonorCenters;
import com.jsp.repository.BloodDonorCenters_Repository;

@Component
public class BloodDonorCentersDaoImple implements BloodDonorCentersDao 
{
	@Autowired
	private BloodDonorCenters_Repository centers_Repository;
	
	@Override
	public List<BloodDonorCenters> findAddress(String address) {
		return centers_Repository.findByAddress(address);
	}

	@Override
	public List<BloodDonorCenters> findCenter(String center) {
		return centers_Repository.findByCentername(center);
	}

	@Override
	public List<BloodDonorCenters> findbycenterandaddress(String center, String address) {
		return centers_Repository.findByCenternameAndAddress(center, address);
	}
	
	// update delete Blood Centers 

	@Override
	public List<BloodDonorCenters> getAllCenters() {
		return centers_Repository.findAll();
	}

	@Override
	public BloodDonorCenters saveCenter(BloodDonorCenters centers) {
		return centers_Repository.save(centers);
	}

	@Override
	public BloodDonorCenters updateCenter(BloodDonorCenters centers) {
		return centers_Repository.save(centers);
	}

	@Override
	public BloodDonorCenters getCenter(int id) {
		return centers_Repository.findById(id).get();
	}

	@Override
	public void deleteCenter(int id) {
		centers_Repository.deleteById(id);
	}

}

package com.jsp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.BloodDonorCenters;

public interface BloodDonorCenters_Repository extends JpaRepository<BloodDonorCenters, Integer> 
{
	List<BloodDonorCenters> findByCentername(String centername);
	
	List<BloodDonorCenters> findByAddress(String address);
	
	List<BloodDonorCenters> findByCenternameAndAddress(String centername, String address);
}

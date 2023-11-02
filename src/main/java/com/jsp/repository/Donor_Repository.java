package com.jsp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.Donor;

public interface Donor_Repository extends JpaRepository<Donor, Integer> 
{
	List<Donor> findByAddressAndBloodgroup(String address, String bloodgroup);
}

package com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.dao.BloodDonorCentersDao;
import com.jsp.entity.BloodDonorCenters;

@Controller
public class AdminController 
{
	@Autowired
	private BloodDonorCentersDao bloodDonorCentersDao;
	
	@RequestMapping("/admin")
	public String gotoCenters(Model model)
	{
		model.addAttribute("bloodcenter", bloodDonorCentersDao.getAllCenters());
		return "BloodCenters";
	}
	
	@RequestMapping("/center/new")
	public String addnewCenter(Model model)
	{
		BloodDonorCenters centers = new BloodDonorCenters();
		model.addAttribute("bloodcenter1", centers);
		return "CreateBloodCenters";
	}
	
	@PostMapping("/newCenter")
	public String saveCenter(@ModelAttribute BloodDonorCenters centers)
	{
		bloodDonorCentersDao.saveCenter(centers);
		return "redirect:/admin";
	}
	
	@GetMapping("/centers/edit/{id}")
	public String editCenter(@PathVariable int id, Model model)
	{
		model.addAttribute("bloodcenter", bloodDonorCentersDao.getCenter(id));
		return "EditBloodCenters";
	}
	
	@PostMapping("/centers/{id}")
	public String updateCenters(@PathVariable int id,@ModelAttribute("bloodcenter") BloodDonorCenters centers,Model model)
	{
		BloodDonorCenters bloodDonorCenters = bloodDonorCentersDao.getCenter(id);
		bloodDonorCenters.setId(centers.getId());
		bloodDonorCenters.setAddress(centers.getAddress());
		bloodDonorCenters.setCentername(centers.getCentername());
		bloodDonorCenters.setPhonenumber(centers.getPhonenumber());
		
		bloodDonorCentersDao.updateCenter(centers);
		return "redirect:/admin";
	}
	
	@GetMapping("/center/{id}")
	public String deleteCenter(@PathVariable int id)
	{
		bloodDonorCentersDao.deleteCenter(id);
		return "redirect:/admin";
	}
}

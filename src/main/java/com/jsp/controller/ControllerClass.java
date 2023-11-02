package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.dao.BloodDonorCentersDao;
import com.jsp.dao.DonorDao;
import com.jsp.dao.UserDao;
import com.jsp.entity.BloodDonorCenters;
import com.jsp.entity.Donor;
import com.jsp.entity.UserInformation;
import com.jsp.repository.UserInformation_Repository;

@Controller
public class ControllerClass 
{
	@RequestMapping("/")
	public String gotohome()
	{
		return "Home";
	}
	
	@RequestMapping("/gotologin")
	public String gotosignpage()
	{
		return "LoginPage";
	}
	
	// go to sign up page 
	@RequestMapping("/gotosignup")
	public String gotosignuppage(Model model)
	{
		UserInformation information = new UserInformation();
		model.addAttribute("user", information);
		return "SignUpPage";
	}
	
	// goto insert values 
	
	@Autowired
	private UserDao dao;
	
	@RequestMapping("/insertvalues")
//	@ResponseBody
	public String insertsingupvalues(UserInformation information)
	{
		dao.insertValues(information);
		return "LoginPage";
	}
	
	// to check the given email and password 
	@Autowired
	private UserDao userDao;
	
	@GetMapping("/tocheck/{email}/{password}")
	public String tocheckEmailandPassword(@RequestParam String email,@RequestParam String password, Model model)
	{
		try {
			UserInformation information = userDao.login(email, password);
			model.addAttribute("user", information.getId());
			return "redirect:/gotohome1";
		} catch (Exception e) {
			return "redirect:/gotologin";
		}
	}
	
	// go to Donate page 
	@RequestMapping("/gotodonatepage")
	public String gotodonate()
	{
		return "Donate";
	}
	
	@RequestMapping("/gotohome1")
	public String gotohome1()
	{
		return "Home1";
	}
	
	@RequestMapping("/gotoabout")
	public String gotoabout()
	{
		return "About";
	}
	
	//=====================================================================================================
//	@Autowired
//	private UserInformation_Repository information_Repository;
//	
//	@RequestMapping("/getuserid/{id}")
//	public String getbyId(@PathVariable Integer id,Model model)
//	{
//		UserInformation information = information_Repository.findById(id).get();
//		model.addAttribute("userInfromation", information);
//		return "Donate";
//	}
	
	
	@Autowired
	private DonorDao donorDao;
	
	@RequestMapping("/donorvalues")
	public String insertdonorvalues(Donor donor)
	{
		donorDao.insertValues(donor);
		return "redirect:/gotohome1";
	}
	
	//=====================================================================================================
	
	// goto search based on blood group and location 
	@RequestMapping("/gotobloodgroup")
	public String gotobloodgroup()
	{
		return "BloodGroupAndLocation";
	}
	
	@GetMapping("/getbloodgroupandlocation")
	public String getbloodgroupandlocation( @RequestParam String address,@RequestParam String bloodgroup,Model model)
	{
		List<Donor> list = donorDao.serachForDonors(address, bloodgroup);
		model.addAttribute("donor", list);
		return "BloodGroupAndLocationList";
	}
	
	
	//===================================================================================================== 
	@Autowired
	private BloodDonorCentersDao bloodDonorCentersDao;
	
	// goto  search based on location 
	@RequestMapping("/gotolocation")
	public String gotolocation()
	{
		return "Location";
	}

	
	@GetMapping("/getLocation")
	public String getlocations(@RequestParam String address,Model model)
	{
		List<BloodDonorCenters> list = bloodDonorCentersDao.findAddress(address);
		model.addAttribute("center", list);
		return "LocationList";
	}
	// ==========================================================================================================
	
}

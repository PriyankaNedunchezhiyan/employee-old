package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Model;
import com.example.demo.repository.AdminRepo;

@Controller
public class NavigationController {

	private AdminRepo adminrepo;

	public NavigationController(AdminRepo adminrepo) {
		super();
		this.adminrepo = adminrepo;
	}

	@GetMapping("/")
	public String home() {
		return ("/index");

	}
	@RequestMapping("/pages-attendance")
	public String pagesattendance(){
		return ("/pages-attendance");
	}
	@RequestMapping("/pages-leavemanagement")
	public String pagesleavemanagement(){
		return ("/pages-leavemanagement");
	}
	@RequestMapping("/pages-master-setting")
	public String pagesmastersetting(){
		return ("/pages-master-setting");
	}
	@RequestMapping("/pages-signin")
	public String pagessignin(){
		return ("/pages-signin");
	}
	@RequestMapping("/pages-user-profile")
	public String pagesuserprofile(){
		return ("/pages-user-profile");
	}
	@RequestMapping("/editpopup")
	public String editpopup(){
		return ("/editpopup");
	}
	@RequestMapping("/leavepopup")
	public String leavepopup() {
		return ("/leavepopup");
	}
	
	@RequestMapping(path = "/admin_employeeapi", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, List<Model>> admin_employee() {
		Map<String, List<Model>> response = new HashMap<>();
		ArrayList<Model> model = new ArrayList<>();
		model = (ArrayList<Model>) adminrepo.findAll();
		response.put("data", model);
		return response;
	}

	@RequestMapping(path = "/popupapi", method = RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String Admin_UpdateDetails(Long id,String employee_id, String firstname, String lastname, String designation,
			String date_of_joining, String mobile, String company_mail, String personal_mail, String address,String dob,
			int  status) {
		adminrepo.save(new Model(id,employee_id, firstname, lastname, designation, date_of_joining, mobile, company_mail,personal_mail, address, dob,status) ); 
		return "/pages-master-setting";
	}
	
	@RequestMapping(path = "/addapi", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String Admin_AddDetails(String employee_id, String firstname, String lastname, String designation,
			String date_of_joining, String mobile, String company_mail, String personal_mail, String address,String dob,
			int  status) {
	
		
		adminrepo.save(new Model(employee_id,firstname,lastname,designation,date_of_joining,mobile,company_mail,personal_mail,address,dob,status));
		return "attendance";
	}
	
	
	
}
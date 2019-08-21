package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.LeaveManage;
import com.example.demo.repository.LeaveRepo;



@Controller
public class LeaveController {
	
	private final LeaveRepo leaverepo;

	public LeaveController(LeaveRepo leaverepo) {
		super();
		this.leaverepo = leaverepo;

	}

	@RequestMapping(path = "/leavemanagementapi", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, List<LeaveManage>> leave() {
		Map<String, List<LeaveManage>> response = new HashMap<>();
		ArrayList<LeaveManage> leavemanage = new ArrayList<>();
		leavemanage = (ArrayList<LeaveManage>) leaverepo.findAll();
		response.put("data", leavemanage);
		return response;
	}

	@RequestMapping(path = "/leaveapproveapi", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String LeaveApprove(Long id,String employee_id, String firstname, String lastname, String mail,
			String from_date, String to_date, String total_days, String allotted_from_date, String allotted_to_date,
			String allotted_days, String leavetype, String leave_description, String cc, String applieddate,
			String status) {
		leaverepo.save(new LeaveManage(id,employee_id, firstname, lastname, mail, from_date, to_date, total_days,
				allotted_from_date, allotted_to_date, allotted_days, leavetype, leave_description, cc, applieddate,
				status));
		return "/pages-leavemanagement";

	}
	
	

}

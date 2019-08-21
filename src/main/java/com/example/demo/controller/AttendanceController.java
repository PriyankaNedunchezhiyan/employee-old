package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Employee_attendance;
import com.example.demo.repository.AttendanceRepo;

@Controller
public class AttendanceController {
	
	private final AttendanceRepo attendancerepo;

	public AttendanceController(AttendanceRepo attendancerepo) {
		super();
		this.attendancerepo=attendancerepo;
	}
	
	@RequestMapping(path = "/attendnceapi", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, List<Employee_attendance>> attendance() {
		Map<String, List<Employee_attendance>> response = new HashMap<>();
		ArrayList<Employee_attendance> employee_attendance = new ArrayList<>();
		employee_attendance = (ArrayList<Employee_attendance>) attendancerepo.findAll();
		response.put("data", employee_attendance);
		return response;
	}

}

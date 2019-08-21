package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Employee_attendance {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column
	private Long id;
	@Column
	private String employee_id;
	/*@Column
	private String first_name;
	@Column
	private String last_name;*/
	@Column
	private String check_in_time;
	@Column
	private String check_out_time;
	@Column
	private String totalhours;
	@Column 
	private String extrahours;
	@Column
	private String date;
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getExtrahours() {
		return extrahours;
	}

	public void setExtrahours(String extrahours) {
		this.extrahours = extrahours;
	}

	public Employee_attendance(Long id, String employee_id, String check_in_time,
			String check_out_time, String totalhours,String extrahours,String date) {
		super();
		this.id = id;
		this.employee_id = employee_id;
	/*	this.first_name = first_name;
		this.last_name = last_name;*/
		this.check_in_time = check_in_time;
		this.check_out_time = check_out_time;
		this.totalhours = totalhours;
		this.extrahours=extrahours;
		this.date=date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
/*
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}*/

	public String getCheck_in_time() {
		return check_in_time;
	}

	public void setCheck_in_time(String check_in_time) {
		this.check_in_time = check_in_time;
	}

	public String getCheck_out_time() {
		return check_out_time;
	}

	public void setCheck_out_time(String check_out_time) {
		this.check_out_time = check_out_time;
	}

	public String getTotalhours() {
		return totalhours;
	}

	public void setTotalhours(String totalhours) {
		this.totalhours = totalhours;
	}

	
public Employee_attendance() {

}
	
	
}

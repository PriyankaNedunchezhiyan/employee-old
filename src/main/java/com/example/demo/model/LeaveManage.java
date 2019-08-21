package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LeaveManage {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	@Column
	private long id;
	 @Column
	private String employee_id;
	 @Column
	 private String firstname;
	 @Column
	 private String lastname;
	 @Column
	 private String mail;
	 @Column
	 private String from_date;
	 @Column 
	 private String to_date;
	 @Column
	 private String total_days;
	 @Column
	 private String allotted_from_date;
	 @Column
	 private String allotted_to_date;
	 @Column
	 private String allotted_days;
	 @Column
	 private String leavetype;
	 @Column
	 private String leave_description;
	 @Column
	 private String cc;
	 @Column
	 private String applieddate;
	 @Column
	 private String status;
	 
	 public LeaveManage(String employee_id, String firstname, String lastname, String mail, String from_date, String to_date, String total_days, String allotted_from_date, String allotted_to_date, String allotted_days, String leavetype, String leave_description, String cc, String applieddate) {
		 
		 super();
			
			this.employee_id = employee_id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.mail = mail;
			this.from_date = from_date;
			this.to_date = to_date;
			this.total_days = total_days;
			this.allotted_from_date = allotted_from_date;
			this.allotted_to_date = allotted_to_date;
			this.allotted_days = allotted_days;
			this.leavetype = leavetype;
			this.leave_description = leave_description;
			this.cc = cc;
			this.applieddate = applieddate;
		
		 
		 
		 
	 }
	 public LeaveManage() {
		 
	 }
	 
	public LeaveManage(Long id,String employee_id, String firstname, String lastname, String mail, String from_date,
			String to_date, String total_days, String allotted_from_date, String allotted_to_date, String allotted_days,
			String leavetype, String leave_description, String cc, String applieddate, String status) {
		super();
		this.id = id;
		this.employee_id = employee_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mail = mail;
		this.from_date = from_date;
		this.to_date = to_date;
		this.total_days = total_days;
		this.allotted_from_date = allotted_from_date;
		this.allotted_to_date = allotted_to_date;
		this.allotted_days = allotted_days;
		this.leavetype = leavetype;
		this.leave_description = leave_description;
		this.cc = cc;
		this.applieddate = applieddate;
		this.status = status;
	}
	public long getId() {
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
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getTo_date() {
		return to_date;
	}
	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}
	public String getTotal_days() {
		return total_days;
	}
	public void setTotal_days(String total_days) {
		this.total_days = total_days;
	}
	public String getAllotted_from_date() {
		return allotted_from_date;
	}
	public void setAllotted_from_date(String allotted_from_date) {
		this.allotted_from_date = allotted_from_date;
	}
	public String getAllotted_to_date() {
		return allotted_to_date;
	}
	public void setAllotted_to_date(String allotted_to_date) {
		this.allotted_to_date = allotted_to_date;
	}
	public String getAllotted_days() {
		return allotted_days;
	}
	public void setAllotted_days(String allotted_days) {
		this.allotted_days = allotted_days;
	}
	public String getLeavetype() {
		return leavetype;
	}
	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}
	public String getLeave_description() {
		return leave_description;
	}
	public void setLeave_description(String leave_description) {
		this.leave_description = leave_description;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getApplieddate() {
		return applieddate;
	}
	public void setApplieddate(String applieddate) {
		this.applieddate = applieddate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LeaveManage [id=" + id + ", employee_id=" + employee_id + ", firstname=" + firstname + ", lastname="
				+ lastname + ", mail=" + mail + ", from_date=" + from_date + ", to_date=" + to_date + ", total_days="
				+ total_days + ", allotted_from_date=" + allotted_from_date + ", allotted_to_date=" + allotted_to_date
				+ ", allotted_days=" + allotted_days + ", leavetype=" + leavetype + ", leave_description="
				+ leave_description + ", cc=" + cc + ", applieddate=" + applieddate + ", status=" + status + "]";
	}
	 
	 


}

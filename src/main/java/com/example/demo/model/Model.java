package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Model {

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
	private String designation;
	@Column
	private String date_of_joining;
	@Column
	private  String mobile;
	@Column
	private String company_mail;
	@Column
	private String personal_mail;
	@Column
	private String address;
	@Column
	private String dob;
	@Column
	private int status;
	
	
	
	/*@Override
	public String toString() {
		return "Model [id=" + id + ", employee_id=" + employee_id + ", firstname=" + firstname + ", lastname="
				+ lastname + ", designation=" + designation + ", date_of_joining=" + date_of_joining + ", mobile="
				+ mobile + ", company_mail=" + company_mail + ", personal_mail=" + personal_mail + ", address="
				+ address + ", status=" + status + "]";
	}*/


	@Override
	public String toString() {
		return "Model [id=" + id + ", employee_id=" + employee_id + ", firstname=" + firstname + ", lastname="
				+ lastname + ", designation=" + designation + ", date_of_joining=" + date_of_joining + ", mobile="
				+ mobile + ", company_mail=" + company_mail + ", personal_mail=" + personal_mail + ", address="
				+ address + ", status=" + status + ", dob=" + dob + "]";
	}
	public Model(Long id,String employee_id, String firstname, String lastname, String designation, String date_of_joining,
			String mobile, String company_mail, String personal_mail, String address,String dob, int status) {
		super();
		this.id=id;
		this.employee_id = employee_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.designation = designation;
		this.date_of_joining = date_of_joining;
		this.mobile = mobile;
		this.company_mail = company_mail;
		this.personal_mail = personal_mail;
		this.address = address;
		this.dob = dob;
		this.status = status;
	}
	public Model(String employee_id, String firstname, String lastname, String designation, String date_of_joining, String mobile, String company_mail, String personal_mail, String address,String dob, int status)
	{
		super();
		this.employee_id = employee_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.designation = designation;
		this.date_of_joining = date_of_joining;
		this.mobile = mobile;
		this.company_mail = company_mail;
		this.personal_mail = personal_mail;
		this.address = address;
		this.dob = dob;
		this.status = status;
		
	}
	
	public Model() {
	
	}
	

	/*public Model(String employee_id, String firstname, String lastname, String designation, String date_of_joining,
			String mobile, String company_mail, String personal_mail, String address, int status) {
		super();
		this.employee_id = employee_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.designation = designation;
		this.date_of_joining = date_of_joining;
		this.mobile = mobile;
		this.company_mail = company_mail;
		this.personal_mail = personal_mail;
		this.address = address;
		this.status = status;
	}
*/

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCompany_mail() {
		return company_mail;
	}
	public void setCompany_mail(String company_mail) {
		this.company_mail = company_mail;
	}
	public String getPersonal_mail() {
		return personal_mail;
	}
	public void setPersonal_mail(String personal_mail) {
		this.personal_mail = personal_mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	
}

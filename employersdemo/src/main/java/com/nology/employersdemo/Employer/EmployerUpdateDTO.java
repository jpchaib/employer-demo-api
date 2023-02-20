package com.nology.employersdemo.Employer;

import java.util.Date;

public class EmployerUpdateDTO {
	
	private String firstname;
	private String lastname;
	private String email;
	private Long number;
	private String address;
	private Boolean ispermanent;
	private Boolean isfulltime;
	private Date startdate;
	private Date finishdate;
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean getIspermanent() {
		return ispermanent;
	}
	public void setIspermanent(Boolean ispermanent) {
		this.ispermanent = ispermanent;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getFinishdate() {
		return finishdate;
	}
	public void setFinishdate(Date finishdate) {
		this.finishdate = finishdate;
	}
	public Boolean getIsfulltime() {
		return isfulltime;
	}
	public void setIsfulltime(Boolean isfulltime) {
		this.isfulltime = isfulltime;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	
}

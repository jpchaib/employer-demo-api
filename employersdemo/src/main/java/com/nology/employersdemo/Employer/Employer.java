package com.nology.employersdemo.Employer;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstname;
	private String lastname;
	private String email;
	private Long number;
	private String address;
	private Boolean ispermanent;
	private Date startdate;
	private Date finishdate;
	private Boolean isfulltime;
	
	public Employer(String firstname, String lastname, String email) {
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setEmail(email);
	}
	
	public Employer() {}

	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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
	
}

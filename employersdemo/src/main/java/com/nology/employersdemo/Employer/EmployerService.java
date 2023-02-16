package com.nology.employersdemo.Employer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployerService {
	@Autowired
	private EmployerRepository repository;
	
	public List<Employer> all(){
		return repository.findAll();
	}
	
	public void create(EmployerDTO employer) {
		Employer e = new Employer(employer.getFirstname(), employer.getLastname(), employer.getEmail());
		repository.save(e);
	}
	
	
}


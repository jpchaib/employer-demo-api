package com.nology.employersdemo.Employer;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
	
	public Optional<Employer> getEmployerById(Long id) {
		return repository.findById(id);
	}
	
	public void create(EmployerDTO employer) {
		Employer e = new Employer(employer.getFirstname(), employer.getLastname(), employer.getEmail(), employer.getNumber(), employer.getAddress(), employer.getIspermanent(), employer.getStartdate(), employer.getFinishdate(), employer.getIsfulltime());
		repository.save(e);
	}
	
	public void update(Long id, EmployerUpdateDTO data) {
		
		Optional<Employer> e = repository.findById(id);
		
		e.ifPresent(employerMaybe -> {
			employerMaybe.setFirstname(data.getFirstname());
			employerMaybe.setLastname(data.getLastname());
			employerMaybe.setEmail(data.getEmail());
			employerMaybe.setNumber(data.getNumber());
			employerMaybe.setAddress(data.getAddress());
			employerMaybe.setIspermanent(data.getIspermanent());
			employerMaybe.setStartdate(data.getStartdate());
			employerMaybe.setFinishdate(data.getFinishdate());
		});
	}
	
	public void delete(Long id) {
		Optional<Employer> e = repository.findById(id);
		e.ifPresent(employerMaybe -> {
			repository.deleteById(id);	
		});
		
	}
	
	
}


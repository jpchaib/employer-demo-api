package com.nology.employersdemo.Employer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value="/employers")
public class EmployerController {
	@Autowired
	private EmployerService employerService;
	
	@GetMapping
	public List<Employer> getEmployers(){
		return employerService.all();
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public void saveEmployer(@Valid @RequestBody EmployerDTO employer) {
		employerService.create(employer);
	}

}

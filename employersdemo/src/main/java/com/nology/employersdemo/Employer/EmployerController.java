package com.nology.employersdemo.Employer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@PatchMapping("/{id}")
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	public ResponseEntity<Employer> update(@PathVariable Long id, @Valid @RequestBody EmployerUpdateDTO employer) {
		Optional<Employer> optionalEmployer = employerService.getEmployerById(id);
		
		if (optionalEmployer.isPresent()) {
			employerService.update(id, employer);
	        return ResponseEntity.ok(optionalEmployer.get());

	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	public ResponseEntity<Employer> update(@PathVariable Long id) {
		Optional<Employer> optionalEmployer = employerService.getEmployerById(id);
		
		if (optionalEmployer.isPresent()) {
			employerService.delete(id);
	        return ResponseEntity.noContent().build();

	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	
	

}

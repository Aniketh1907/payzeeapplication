package com.project.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.jpa.exception.ResourceNotFoundException;
import com.project.jpa.model.SenderDetails;
import com.project.jpa.repository.SenderRepository;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:4200")
public class SenderController {
    @Autowired
	private SenderRepository senderrepository;
	@GetMapping("/details")
    public List<SenderDetails>getAllSenderDetails(){
    	return senderrepository.findAll();
    }
	
	@GetMapping("/details/{id}")
	public List<SenderDetails> getSenderDetailsById(@PathVariable long id) {
		
		return senderrepository.findByCustomerId(id);
		
	}
	@PostMapping("/balance")
	public ResponseEntity<SenderDetails> getSenderDetailById(@RequestBody SenderDetails senderdetails) {
		System.out.println(senderdetails);
		SenderDetails sd = senderrepository.findById(senderdetails.getCustomerId()).
				orElseThrow(()-> new ResourceNotFoundException("Doesn't exist by id: "+senderdetails.getCustomerId()));
		return ResponseEntity.ok(sd);
		
	}
	
}

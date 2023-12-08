package com.demo.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.demo.store.entities.Clints;
import com.demo.store.service.ClintsService;


@RestController
public class ClintsController {

	@Autowired
	ClintsService clintsservice;
	
	@GetMapping("/login")
	public Clints login(@RequestHeader String email ,@RequestHeader String password) {
		return clintsservice.login(email,password); 
	}
	
	@PostMapping("/post")
	public Clints addClints(@RequestBody Clints clints) {
		return clintsservice.addClints(clints);
	}
	
	@PutMapping("/update")
	public Clints update(@RequestHeader String email ,@RequestBody Clints clints) {
		
		return clintsservice.updateDb(email,clints); 
	}
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String email) {
		clintsservice.deleteDb(email);
		return "data deleted";
	}
	
}

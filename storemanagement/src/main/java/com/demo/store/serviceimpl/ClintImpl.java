package com.demo.store.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.store.entities.Clints;
import com.demo.store.exception.ResourceNotFoundException;
import com.demo.store.repository.ClintsRepo;
import com.demo.store.service.ClintsService;

@Service
public class ClintImpl implements ClintsService {
	@Autowired
	ClintsRepo clintsRepo;
	
	public Clints login(String email, String password) {
		Clints s = clintsRepo.findByEmail(email);
		 
		 if(s!=null) {
			 if(s.getPassword().equals(password)) {
				 return s;
			 }else {
				throw new ResourceNotFoundException();
			}
		 }else {
			 throw new ResourceNotFoundException();
		 }
	  
	}

	public Clints addClints(Clints clints) {
		return  clintsRepo.save(clints);
	}

	public Clints updateDb(String email,Clints clints) {
		
		
		Clints s1 = clintsRepo.findByEmail(email);
		
		if(s1!=null) {   
			s1.setUsername(clints.getUsername());
			s1.setPassword(clints.getPassword());
		return clintsRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	public void deleteDb(String email) {
	
		
		Clints s2 = clintsRepo.findByEmail(email);
		
		if(s2!=null) {
			clintsRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}

	
	
}



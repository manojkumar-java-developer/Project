package com.demo.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.store.entities.Clints;

@Repository
public interface ClintsRepo extends JpaRepository<Clints, Integer> {

	@Query(value =  "select * from clients where email =?" , nativeQuery = true)
	Clints findByEmail(String email);

}


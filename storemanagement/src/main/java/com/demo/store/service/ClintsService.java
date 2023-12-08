package com.demo.store.service;

import com.demo.store.entities.Clints;

public interface ClintsService {
	
		Clints login(String email ,String password);

			Clints addClints(Clints clints);

			Clints updateDb(String email,Clints clints);

			void deleteDb(String email);
		}

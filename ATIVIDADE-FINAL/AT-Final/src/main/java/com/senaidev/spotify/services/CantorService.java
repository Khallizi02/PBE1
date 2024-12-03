package com.senaidev.spotify.services;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.spotify.entities.CantorEntity;
import com.senaidev.spotify.repository.CantorRepository;

@Service
public class CantorService {

	@Autowired
	private CantorRepository cantorrepository;
	
	public CantorEntity saveCantor(CantorEntity cantor) {
		return cantorrepository.save(cantor);
	}
	
	public List<CantorEntity> getAllCantor(){
		return cantorrepository.findAll();
	}
	
	public CantorEntity getCantorById(Long id) {
		return cantorrepository.findById(id).orElse(null);
	}
	
	public void deleteCantorEntity(Long id) {
		cantorrepository.deleteById(id);
	}
}

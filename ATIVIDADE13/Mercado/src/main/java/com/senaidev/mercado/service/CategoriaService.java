package com.senaidev.mercado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.mercado.entitie.Categoria;
import com.senaidev.mercado.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriarepository;
	
	public Categoria saveDepartamento(Categoria categoria) {

		return categoriarepository.save(categoria);
	}
	
	public List<Categoria> getAllCategoria() {

		return categoriarepository.findAll();
	}
	
	public Categoria getById(Long id) {

		return categoriarepository.findById(id).orElse(null);
	}

	public void deleteDepartamento(Long id) {
		categoriarepository.deleteById(id);
	}

}

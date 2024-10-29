package com.bibliotecasenai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.entities.Livro;
import com.senaidev.cadastroproduto.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livrorepository;
	
	public Livro saveLivro(Livro livro) {
		
		return livrorepository.save(livro);
	}
	
	public List<Livro> getAllLivros() {
		
		return livrorepository.findAll();
	}
	
	public Livro getLivroById (Long id) {
		
		return livrorepository.findById(id).orElse(null);
	}
	
	public void deleteLivro(Long id) {
		livrorepository.deleteById(id);
	}
}

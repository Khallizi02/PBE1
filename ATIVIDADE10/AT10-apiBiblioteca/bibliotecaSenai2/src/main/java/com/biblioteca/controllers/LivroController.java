package com.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.entities.Livro;
import com.bibliotecasenai.services.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	private LivroService livroService;
	
	@PostMapping
	public Livro createLivro(Livro livro) {
		
		return livroService.saveLivro(livro);
	}
	
	@GetMapping
	public List<Livro>getAllLivro() {
		
		return livroService.getAllLivros();
	}
	
	@GetMapping("/{id}")
	public Livro getLivro(@PathVariable Long id) {
		return 	livroService.getLivroById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLivro(@PathVariable Long id) {
		livroService.deleteLivro(id);
	}
}

package com.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.entities.Editora;
import com.bibliotecasenai.services.EditoraService;

@RestController
@RequestMapping("/editora")
public class EditoraController {

	@Autowired
	private EditoraService editoraService;
	
	@PostMapping
	public Editora createEditora(Editora editora) {
		
		return editoraService.saveEditora(editora);
	}
	
	@GetMapping
	public List<Editora>getAllEditora() {
		
		return editoraService.getAllEditoras();
	}
	
	@GetMapping("/{id}")
	public Editora getEditora(@PathVariable Long id) {
		return 	editoraService.getEditoraById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEditora(@PathVariable Long id) {
		editoraService.deleteEditora(id);
	}
}

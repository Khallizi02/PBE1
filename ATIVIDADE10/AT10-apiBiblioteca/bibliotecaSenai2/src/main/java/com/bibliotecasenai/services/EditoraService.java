package com.bibliotecasenai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.entities.Editora;
import com.senaidev.cadastroproduto.EditoraRepository;

@Service
public class EditoraService {

	@Autowired
	private EditoraRepository editoraRepository;

	public Editora saveEditora(Editora editora) {

		return editoraRepository.save(editora);
	}

	public List<Editora> getAllEditoras() {

		return editoraRepository.findAll();
	}

	public Editora getEditoraById(Long id) {

		return editoraRepository.findById(id).orElse(null);
	}

	public void deleteEditora(Long id) {
		editoraRepository.deleteById(id);
	}
}

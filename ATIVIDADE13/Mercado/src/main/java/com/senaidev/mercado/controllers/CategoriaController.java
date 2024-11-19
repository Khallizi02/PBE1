package com.senaidev.mercado.controllers;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.mercado.entitie.Categoria;
import com.senaidev.mercado.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
    private CategoriaService CategoriaService;
    
    @PostMapping
    public Categoria createCategoria(Categoria categoria) {
        
        return CategoriaService.saveCategoria(categoria);
    }
    
    @GetMapping
    public List<Categoria>getAllCategoria() {
        
        return CategoriaService.getAllCategoria();
    }
    
    @GetMapping("/{id}")
    public Categoria getCategoria(@PathVariable Long id) {
        
        return CategoriaService.getCategoriaById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable Long id) {
        CategoriaService.deleteCategoria(id);
    }

}

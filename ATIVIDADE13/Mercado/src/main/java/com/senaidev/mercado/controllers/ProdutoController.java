package com.senaidev.mercado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.senaidev.mercado.entitie.Produto;
import com.senaidev.mercado.service.ProdutoService;

public class ProdutoController {

    @Autowired
    private ProdutoService ProdutoService;
    
    @PostMapping
    public Produto createProduto(Produto produto) {
        
        return ProdutoService.saveProduto(produto);
    }
    
    @GetMapping(value="/{id}")
    public ResponseEntity<Produto>getAllProduto() {
        
        Long id;
        Produto produto = ProdutoService.getProdutoById(id);
        
        if(produto != null) {
            return ResponseEntity.ok(produto);
        }else {
            return ResponseEntity.notFound().build();
        }
        
    }
    
    @GetMapping("/{id}")
    public Produto getProduto(@PathVariable Long id) {
        
        return ProdutoService.getProdutoById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable Long id) {
        ProdutoService.deleteProduto(id);
    }
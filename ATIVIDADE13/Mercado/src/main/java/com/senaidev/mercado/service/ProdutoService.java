package com.senaidev.mercado.service;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senaidev.mercado.entitie.Categoria;
import com.senaidev.mercado.entitie.Produto;
import com.senaidev.mercado.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtorepository;
	
	public Produto saveDepartamento(Produto produto) {
		return produtorepository.save(produto);
	}
	
	public List<Produto> getAllProduto(){
		return produtorepository.findAll();
	}
	
	public Produto getById(Long id) {

		return produtorepository.findById(id).orElse(null);
	}
	
	public void deleteDepartamento(Long id) {
		produtorepository.deleteById(id);
	}

}

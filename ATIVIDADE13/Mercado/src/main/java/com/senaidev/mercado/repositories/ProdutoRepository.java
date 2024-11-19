package com.senaidev.mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.mercado.entitie.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>  {

}

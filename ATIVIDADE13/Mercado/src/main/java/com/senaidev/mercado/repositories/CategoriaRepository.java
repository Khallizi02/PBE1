package com.senaidev.mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.mercado.entitie.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>  {

}

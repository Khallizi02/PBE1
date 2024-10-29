package com.senaidev.cadastroproduto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}

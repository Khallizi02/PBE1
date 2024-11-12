package com.senaidev.saraiva;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saraiva.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}

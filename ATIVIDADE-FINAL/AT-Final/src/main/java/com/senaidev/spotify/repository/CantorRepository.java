package com.senaidev.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.spotify.entities.CantorEntity;

public interface CantorRepository extends JpaRepository<CantorEntity, Long> {

}

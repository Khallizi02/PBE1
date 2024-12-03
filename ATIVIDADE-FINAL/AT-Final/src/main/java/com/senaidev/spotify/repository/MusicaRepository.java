package com.senaidev.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.spotify.entities.MusicaEntity;

public interface MusicaRepository extends JpaRepository<MusicaEntity, Long> {

}

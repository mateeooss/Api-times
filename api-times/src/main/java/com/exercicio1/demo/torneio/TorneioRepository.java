package com.exercicio1.demo.torneio;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TorneioRepository extends JpaRepository<Torneio, Long> {

   List<Torneio> findAll();

   Torneio findById(long id);
}

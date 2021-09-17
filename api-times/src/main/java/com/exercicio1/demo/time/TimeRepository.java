package com.exercicio1.demo.time;


import com.exercicio1.demo.torneio.Torneio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Time, Long> {
    Time findById(long id);

}

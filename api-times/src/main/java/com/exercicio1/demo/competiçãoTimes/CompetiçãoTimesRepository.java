package com.exercicio1.demo.competiçãoTimes;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompetiçãoTimesRepository extends JpaRepository<CompetiçãoTimes, Long> {
    List<CompetiçãoTimes> findAll();



}

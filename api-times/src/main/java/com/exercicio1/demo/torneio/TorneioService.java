package com.exercicio1.demo.torneio;

import com.exercicio1.demo.time.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorneioService {
    @Autowired
    TorneioRepository torneioRepo;

    public void save(Torneio torneio){
        torneioRepo.save(torneio);
    }

    public List<Torneio> findAll(){
        return torneioRepo.findAll();
    }

    public Torneio findById(long id){
        return torneioRepo.findById(id);
    }
}

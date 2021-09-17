package com.exercicio1.demo.time;


import com.exercicio1.demo.torneio.Torneio;
import org.hibernate.internal.util.compare.ComparableComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeService{
    @Autowired
    TimeRepository timeRepo;



    public void save(Time time){
         timeRepo.save(time);
    }

    public List<Time> findAll(){
       return timeRepo.findAll();
    }


    public Time findById(long id){
        return timeRepo.findById(id);
    }
}

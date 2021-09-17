package com.exercicio1.demo.competiçãoTimes;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import java.util.List;
 @Service
public class CompetiçãoTimesService {
    @Autowired
   CompetiçãoTimesRepository competiçãoTimesRep;

   public void save(CompetiçãoTimes competiçãoTimes){
       competiçãoTimesRep.save(competiçãoTimes);
   }
    public List<CompetiçãoTimes> findAll(){
       return competiçãoTimesRep.findAll();
    }


}

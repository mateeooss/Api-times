package com.exercicio1.demo.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api-time")
public class TimeController {
    @Autowired
    TimeRepository timeRep;

    @PostMapping("/time")
    public void adicionarTime(@RequestBody @Validated Time time){
       timeRep.save(time);
    }

   @GetMapping("/time")
   public List<Time> listarTimes(){
        return timeRep.findAll();
   }

}

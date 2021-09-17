package com.exercicio1.demo.competiçãoTimes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/competicao")
public class CompetiçãoTimesContoller {
   @Autowired
   CompetiçãoTimesRepository competiçãoTimesRepo;

   @GetMapping
   public List<CompetiçãoTimes> listarCompeticaoTime(){
        return competiçãoTimesRepo.findAll();
    }

    @PostMapping
    public void salvarCompeticaoTime(@RequestBody @Validated CompetiçãoTimes competiçãoTimes){
       competiçãoTimesRepo.save(competiçãoTimes);
    }

    @GetMapping("{id}")
    public List<CompetiçãoTimes> placar(@PathVariable @Validated  Long id){




      List<CompetiçãoTimes> a;

        a=competiçãoTimesRepo.findAll(Sort.by(Sort.Direction.DESC, "pontos"));
//
//        for(CompetiçãoTimes y : a){
//         if(y.getCampId()!=id) a.remove(y.getClass());
//       }
//        return a;
//         a.stream()
//              .filter(ct -> ct.getCampId().equals(id))
//              .collect(Collectors.toList());
        return a.stream().filter(o -> o.getCampId() == id).collect(Collectors.toList());
    }


}

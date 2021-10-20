package com.exercicio1.demo.torneio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api-torneio")
public class TorneioController {
    @Autowired
    TorneioService torneioService;

    @PostMapping("/torneio")
    public void salvarTorneio(@RequestBody @Validated Torneio torneio){
        torneioService.save(torneio);
    }

    @GetMapping("/torneio")
    public List<Torneio> listarTorneios(){
        return torneioService.findAll();
    }

    @GetMapping("/{id}")
    public Torneio listarTorneio(@PathVariable(value="id") long id){
        return torneioService.findById(id);
    }


}

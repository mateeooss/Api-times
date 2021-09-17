package com.exercicio1.demo.torneio;

import com.exercicio1.demo.competiçãoTimes.CompetiçãoTimes;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Torneio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_torneio")
    private Long id;


   // private List<CompetiçãoTimes> competiçãoTimes;
    private Date dataInicial;
    private Date dataFinal;

    public Torneio (){
    }

    public Torneio(Date dataInicial, Date dataFinal) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }
    public Date getDataInicial() {
        return dataInicial;
    }

    public Long getid(){
        return this.id;
    }
    public Date getDataFinal() {
        return dataFinal;
    }


}

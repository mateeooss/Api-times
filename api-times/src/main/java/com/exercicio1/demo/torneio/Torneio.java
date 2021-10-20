package com.exercicio1.demo.torneio;

import com.exercicio1.demo.competiçãoTimes.CompetiçãoTimes;
import lombok.Data;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Torneio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_torneio")
    private Long id;
    private String nome;

   // private List<CompetiçãoTimes> competiçãoTimes;
    private Date dataInicial;
    private Date dataFinal;

    public Torneio (){
    }

    public Torneio(String nome, Date dataInicial, Date dataFinal) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.nome=nome;
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

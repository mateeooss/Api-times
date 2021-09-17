package com.exercicio1.demo.competiçãoTimes;

import com.exercicio1.demo.time.Time;
import com.exercicio1.demo.torneio.Torneio;

import javax.persistence.*;
import javax.persistence.GenerationType;
@Entity
public class CompetiçãoTimes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id_compT")
    private Long id;
    @OneToOne
    @JoinColumn(name="id_time")
    private Time time;

    @OneToOne
    @JoinColumn(name="id_torneio")
    private Torneio torneio;
    private Long pontos = 30L;

    public CompetiçãoTimes() {
    }

    public CompetiçãoTimes(Time time,Torneio torneio) {
        this.time = time;
        this.torneio = torneio;
    }



    public Long getPontos() {
        return pontos;
    }

    public Long getId(){return this.id;}


    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Torneio getTorneio() {
        return torneio;
    }

    public void setTorneio(Torneio torneio) {
        this.torneio = torneio;
    }

    public void pontosMais (Long pontos){
        this.pontos=this.pontos-pontos;

    }
    public void pontosMenos(Long pontos){
        this.pontos=this.pontos+pontos;

    }
    public Long getCampId(){
        return this.torneio.getid();
    }
}

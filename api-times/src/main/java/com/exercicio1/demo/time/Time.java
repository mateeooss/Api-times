package com.exercicio1.demo.time;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import javax.persistence.*;

@Entity
public class Time //implements Comparator{
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_time")
    private Long id;
    private String nome;

    public Time() {
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

//    @Override
//    public int compare(Object o1, Object o2) {
//
//        return 0;
//
//    }
}

package com.webApp.entity;

import javax.persistence.*;

/**
 * Created by Devon Ravihansa on 8/29/2017.
 */
@Entity
public class Jelo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_jelo;
    @Column(nullable = false)
    private String ime;
    @Column(nullable = false)
    private double cijena;

    public Jelo(Long id_jelo, String ime, double cijena) {
        this.id_jelo = id_jelo;
        this.ime = ime;
        this.cijena = cijena;
    }
    
 

    public Jelo() {
        super();
    }

    public Long getId_jelo() {
        return id_jelo;
    }

    public void setId_jelo(Long id_jelo) {
        this.id_jelo = id_jelo;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }
    
    

    
}

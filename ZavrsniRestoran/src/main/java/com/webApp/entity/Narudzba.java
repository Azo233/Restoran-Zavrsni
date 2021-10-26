package com.webApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="narudzba")
public class Narudzba {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_narudzba;
    @ManyToOne
    private User user;
    @ManyToOne
    private Jelo jelo;

    public Narudzba(Long id_narudzba, User user, Jelo jelo) {
        this.id_narudzba = id_narudzba;
        this.user = user;
        this.jelo = jelo;
    }
    
   

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
   

	public Long getId_narudzba() {
		return id_narudzba;
	}

	public void setId_narudzba(Long id_narudzba) {
		this.id_narudzba = id_narudzba;
	}



    public Jelo getJelo() {
        return jelo;
    }

    public void setJelo(Jelo jelo) {
        this.jelo = jelo;
    }




   





}
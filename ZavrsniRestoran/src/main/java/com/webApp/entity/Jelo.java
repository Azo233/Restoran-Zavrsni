package com.webApp.entity;

import javax.persistence.*;
import org.springframework.stereotype.Component;


@Entity
@Table(name="jelo")
@Component
public class Jelo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_jelo;
    private String ime;
    private float cijena;

 

    public Jelo(Long id_jelo, String ime, float cijena) {
		super();
		this.id_jelo = id_jelo;
		this.ime = ime;
		this.cijena = cijena;
	}





	public Jelo() {
        super();
    }

    
  

 
    public float getCijena() {
        return cijena;
    }

    public void setCijena(float cijena) {
        this.cijena = cijena;
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
}

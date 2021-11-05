package com.webApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


public class CartItem {

    private final Jelo jelo;

    private int quantity;

    private double subTotal;
    
    private String ime;
    
    private double cijena;

  
    CartItem(Jelo jelo) {
        this.jelo = jelo;
        this.quantity = 1;
        this.subTotal = jelo.getCijena();
        this.ime = jelo.getIme();
        this.cijena = jelo.getCijena();
    }


    public String getIme() {
        return jelo.getIme();
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getCijena() {
        return jelo.getCijena();
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    
    public Jelo getJelo() {
        return jelo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal() {
        subTotal = jelo.getCijena() * quantity;
        return subTotal;
    }
}

package com.example.TransitApp.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produit {

    @Id
    @GeneratedValue
    private int id;
    private String reference;
    private String designation;
    private double prix;



    public Produit() {

    }

    public Produit(int id, String reference, String designation, double prix) {
        this.id = id;
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}

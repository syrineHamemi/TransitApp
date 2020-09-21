package com.example.TransitApp.web.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Produit {

    @Id
    @GeneratedValue
    private Long produit_id;
    private String reference;
    private String designation;
    private Double tva;
    @ManyToOne
    public commande commande;

   @OneToMany(mappedBy = "produit")
   Set<fournir> fournirs;


    public Produit() {

    }

    public Produit(Long produit_id, String reference, String designation, Double tva) {
        this.produit_id = produit_id;
        this.reference = reference;
        this.designation = designation;
        this.tva = tva;
    }

    public Double getTva() {
        return tva;
    }

    public void setTva(Double tva) {
        this.tva = tva;
    }

    public Long getProduit_id() {
        return produit_id;
    }

    public void setProduit_id(Long produit_id) {
        this.produit_id = produit_id;
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


}

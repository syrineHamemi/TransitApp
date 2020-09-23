package com.example.TransitApp.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class fournir {

    @Id
    Long id ;

    @ManyToOne
    @JoinColumn(name = "produit_id", referencedColumnName = "produit_id")
    Produit produit;


    @ManyToOne
    @JoinColumn(name = "fournisseur_id", referencedColumnName = "fournisseur_id")
    Fournisseur fournisseur;


    public fournir() {
    }

    public fournir(Long id, Produit produit, Fournisseur fournisseur) {
        this.id = id;
        this.produit = produit;
        this.fournisseur = fournisseur;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }
}

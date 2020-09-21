package com.example.TransitApp.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

@Entity

public class commande {

    @Id
    @GeneratedValue
    private Long id;
    private double remise;
    private int Quantite;
    private int numeroCmd;
    private Date date;

    @OneToMany(mappedBy = "commande")
    private Set <Produit> produits;


    public commande() {
    }


    public commande(Long id, double remise, int quantite, int numeroCmd, Date date, Set<Produit> produits) {
        this.id = id;
        this.remise = remise;
        Quantite = quantite;
        this.numeroCmd = numeroCmd;
        this.date = date;
        this.produits = produits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public int getQuantite() {
        return Quantite;
    }

    public void setQuantite(int quantite) {
        Quantite = quantite;
    }

    public int getNumeroCmd() {
        return numeroCmd;
    }

    public void setNumeroCmd(int numeroCmd) {
        this.numeroCmd = numeroCmd;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Set<Produit> produits) {
        this.produits = produits;
    }
}

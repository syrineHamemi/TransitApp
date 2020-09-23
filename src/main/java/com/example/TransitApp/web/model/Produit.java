package com.example.TransitApp.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Produit {

    @Id
    @GeneratedValue
    private Long produit_id;
    private String reference;
    private String designation;
    private Double tva;
    private Double price;
    private String pictureUrl;


    @OneToMany(mappedBy = "produit")
    Set<fournir> fournirs;


    public Produit() {

    }

    public Produit(Long produit_id, String reference, String designation, Double tva, Double price, String pictureUrl, Set<fournir> fournirs) {
        this.produit_id = produit_id;
        this.reference = reference;
        this.designation = designation;
        this.tva = tva;
        this.price = price;
        this.pictureUrl = pictureUrl;
        this.fournirs = fournirs;
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

    public Double getTva() {
        return tva;
    }

    public void setTva(Double tva) {
        this.tva = tva;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Set<fournir> getFournirs() {
        return fournirs;
    }

    public void setFournirs(Set<fournir> fournirs) {
        this.fournirs = fournirs;
    }
}

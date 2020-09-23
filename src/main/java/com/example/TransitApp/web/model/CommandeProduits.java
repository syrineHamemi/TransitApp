package com.example.TransitApp.web.model;

import com.example.TransitApp.web.Embeddable.CommandeProduitsPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class CommandeProduits {

    @EmbeddedId
    @JsonIgnore
    private CommandeProduitsPK pk;

    @Column(nullable = false)
    private Integer quantity;

    //default constructor

    public CommandeProduits(commande order, Produit product, Integer quantity) {
        pk = new CommandeProduitsPK();
        pk.setCommande(order);
        pk.setProduit(product);
        this.quantity = quantity;
    }

    public CommandeProduits() {
    }
}

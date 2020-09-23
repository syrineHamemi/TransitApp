package com.example.TransitApp.web.Embeddable;

import com.example.TransitApp.web.model.Produit;
import com.example.TransitApp.web.model.commande;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class CommandeProduitsPK implements Serializable {

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "commande_id", referencedColumnName = "commande_id")
    private commande commande;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "produit_id", referencedColumnName = "produit_id")
    private Produit produit;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public com.example.TransitApp.web.model.commande getCommande() {
        return commande;
    }

    public void setCommande(com.example.TransitApp.web.model.commande commande) {
        this.commande = commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}

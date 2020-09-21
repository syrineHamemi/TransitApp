package com.example.TransitApp.web.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class fournir {

    @Id
    Long id ;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    Produit produit;


    @ManyToOne
    @JoinColumn(name = "fournisseur_id")
    Fournisseur fournisseur;





}

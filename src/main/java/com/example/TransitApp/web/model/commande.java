package com.example.TransitApp.web.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity

public class commande {

    @Id
    @GeneratedValue
    private Long commande_id;
    private double remise;
    private int Quantite;
    private int numeroCmd;
    private LocalDate date;
    private String status;

    @JsonManagedReference
    @OneToMany()
    private List<CommandeProduits> orderProducts = new ArrayList<>();

    @ManyToOne()
    @JoinColumn(name = "transporteur_id", nullable = false, referencedColumnName = "transporteur_id")
    private transporteur transporteur;

    public commande() {
    }

    public commande(Long commande_id, double remise, int quantite, int numeroCmd, LocalDate date, String status, List<CommandeProduits> orderProducts, com.example.TransitApp.web.model.transporteur transporteur) {
        this.commande_id = commande_id;
        this.remise = remise;
        Quantite = quantite;
        this.numeroCmd = numeroCmd;
        this.date = date;
        this.status = status;
        this.orderProducts = orderProducts;
        this.transporteur = transporteur;
    }

    public Long getCommande_id() {
        return commande_id;
    }

    public void setCommande_id(Long commande_id) {
        this.commande_id = commande_id;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<CommandeProduits> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(List<CommandeProduits> orderProducts) {
        this.orderProducts = orderProducts;
    }

    public com.example.TransitApp.web.model.transporteur getTransporteur() {
        return transporteur;
    }

    public void setTransporteur(com.example.TransitApp.web.model.transporteur transporteur) {
        this.transporteur = transporteur;
    }
}

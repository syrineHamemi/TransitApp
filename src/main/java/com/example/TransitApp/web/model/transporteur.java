package com.example.TransitApp.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class transporteur {

    @Id
    @GeneratedValue
    private Long transporteur_id;
    private String name;
    private String contact;
    private String mail;
    private String address;
    private String MF;

    @OneToMany(mappedBy = "transporteur")
    private Set<commande> commande;

    public transporteur(Long transporteur_id, String name, String contact, String mail, String address, String MF, Set<com.example.TransitApp.web.model.commande> commande) {
        this.transporteur_id = transporteur_id;
        this.name = name;
        this.contact = contact;
        this.mail = mail;
        this.address = address;
        this.MF = MF;
        this.commande = commande;
    }

    public Long getTransporteur_id() {
        return transporteur_id;
    }

    public void setTransporteur_id(Long transporteur_id) {
        this.transporteur_id = transporteur_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMF() {
        return MF;
    }

    public void setMF(String MF) {
        this.MF = MF;
    }

    public Set<com.example.TransitApp.web.model.commande> getCommande() {
        return commande;
    }

    public void setCommande(Set<com.example.TransitApp.web.model.commande> commande) {
        this.commande = commande;
    }
}

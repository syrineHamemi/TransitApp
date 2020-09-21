package com.example.TransitApp.web.model;

import com.mysql.jdbc.log.Log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class transporteur {

    @Id
    @GeneratedValue
    private Long id ;
    private String name;
    private String contact;
    private String mail;
    private String address;
    private String MF;
    @OneToOne(mappedBy = "transporteur")
    private Livraison livraison ;

    public transporteur() {
    }

    public transporteur(Long id, String name, String contact, String mail, String address, String MF) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.mail = mail;
        this.address = address;
        this.MF = MF;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}

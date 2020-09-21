package com.example.TransitApp.web.model;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Livraison {

    @Id
    @GeneratedValue
    private Long id;
    private Date dateLivraison;
    private Date DatePrevu;
    private String trackingNumber;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "transporteur_id")
    private transporteur transporteur;



// trnsporteur


    public Livraison() {
    }

    public Livraison(Long id, Date dateLivraison, Date datePrevu, String trackingNumber) {
        this.id = id;
        this.dateLivraison = dateLivraison;
        DatePrevu = datePrevu;
        this.trackingNumber = trackingNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public Date getDatePrevu() {
        return DatePrevu;
    }

    public void setDatePrevu(Date datePrevu) {
        DatePrevu = datePrevu;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}

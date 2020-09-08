package com.example.TransitApp.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fournisseur {
        @Id
        @GeneratedValue
        private Long id;
        private String name;

    public Fournisseur(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Fournisseur() {
        super();
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

    @Override
    public String toString(){
        return "Fournisseur{"+
                "id=" + id +
                ", nom='"+ name ;
    }
}

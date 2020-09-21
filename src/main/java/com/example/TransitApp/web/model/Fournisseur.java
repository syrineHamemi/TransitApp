package com.example.TransitApp.web.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Fournisseur {
        @Id
        @GeneratedValue
        private Long fournisseur_id;
        private String name;

        @OneToMany(mappedBy = "fournisseur")
        Set<fournir> fournirs;


    public Fournisseur(Long fournisseur_id, String name) {
        this.fournisseur_id = fournisseur_id;
        this.name = name;
    }

    public Fournisseur() {
        super();
    }


    public Long getFournisseur_id() {
        return fournisseur_id;
    }

    public void setFournisseur_id(Long fournisseur_id) {
        this.fournisseur_id = fournisseur_id;
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
                "id=" + fournisseur_id +
                ", nom='"+ name ;
    }
}

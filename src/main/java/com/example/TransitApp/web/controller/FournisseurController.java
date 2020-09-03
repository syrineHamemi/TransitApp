package com.example.TransitApp.web.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FournisseurController {


    @RequestMapping(value="/Fournisseur", method= RequestMethod.GET)  // c'est l'annotation @RequestMapping  qui permet de faire le lien entre l'URI "/Produits", invoquée via GET, et la méthode listeProduits .
    public String listeFournisseur() {
        return "Un exemple de produit";
    }
}

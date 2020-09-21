package com.example.TransitApp.web.controller;

import com.example.TransitApp.web.Exception.FournissurNotFoundException;
import com.example.TransitApp.web.model.Produit;
import com.example.TransitApp.web.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class ProduitController {




        @Autowired
        private ProduitRepository produitRepository;

        @GetMapping("/produits")
        public List retreiveAllProduits(){
            return produitRepository.findAll();
        }


        @GetMapping("/produit/{id}")
        public Produit retrieveProduit (@PathVariable Long id) throws FournissurNotFoundException {
            Optional<Produit> produit = produitRepository.findById(id);

            if (!produit.isPresent())
                throw new FournissurNotFoundException("id-"+id);
            return produit.get();
        }

        @DeleteMapping("produit/{id}")
        public void deleteProduit(@PathVariable Long id ){
            produitRepository.deleteById(id);
        }

        @PostMapping("/produit")
        public ResponseEntity<Object> createProduit(@RequestBody Produit produit){
            Produit saveProduit = (Produit) produitRepository.save(produit);

            URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveProduit.getProduit_id()).toUri();
            return ResponseEntity.created(location).build();
        }

        @PutMapping("/produit/{id}")
        public ResponseEntity<Object> updateProduit (@RequestBody Produit produit, @PathVariable Long id){
            Optional<Produit> produitOptional=produitRepository.findById(id);
            if (!produitOptional.isPresent())
                return ResponseEntity.notFound().build();
            produit.setProduit_id(id);
            produitRepository.save(produit);

            return ResponseEntity.noContent().build();

        }
}

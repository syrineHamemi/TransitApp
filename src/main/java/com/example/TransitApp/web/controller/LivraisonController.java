package com.example.TransitApp.web.controller;

import com.example.TransitApp.web.Exception.FournissurNotFoundException;
import com.example.TransitApp.web.model.Livraison;
import com.example.TransitApp.web.repository.LivraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController

public class LivraisonController {

    @Autowired
    private LivraisonRepository livraisonRepository;

    @GetMapping("/livraison")
    public List retreiveAllLivraison(){
        return livraisonRepository.findAll();
    }


    @GetMapping("/livraison/{id}")
    public Livraison retrieveLivraison (@PathVariable Long id) throws FournissurNotFoundException {
        Optional<Livraison> livraison = livraisonRepository.findById(id);

        if (!livraison.isPresent())
            throw new FournissurNotFoundException("id-"+id);
        return livraison.get();
    }

    @DeleteMapping("livraison/{id}")
    public void deleteLivraison(@PathVariable Long id ){
        livraisonRepository.deleteById(id);
    }

    @PostMapping("/livraisons")
    public ResponseEntity<Object> createLivraison(@RequestBody Livraison livraison){
        Livraison saveLivraison = (Livraison) livraisonRepository.save(livraison);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveLivraison.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/livraison/{id}")
    public ResponseEntity<Object> updateLivraison(@RequestBody Livraison livraison, @PathVariable Long id){
        Optional<Livraison> livraisonOptional=livraisonRepository.findById(id);
        if (!livraisonOptional.isPresent())
            return ResponseEntity.notFound().build();
        livraison.setId(id);
        livraisonRepository.save(livraison);

        return ResponseEntity.noContent().build();

    }
}

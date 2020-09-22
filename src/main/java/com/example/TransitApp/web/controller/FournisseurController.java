package com.example.TransitApp.web.controller;
import com.example.TransitApp.web.Exception.FournissurNotFoundException;
import com.example.TransitApp.web.model.Fournisseur;
import com.example.TransitApp.web.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;


@RestController
public class FournisseurController {


    @Autowired
    private FournisseurRepository fournisseurRepository;
    @CrossOrigin(origins = "http://localhost:7896")
    @GetMapping("/fournisseurs")
            public List retreiveAllFournissuers(){
                return fournisseurRepository.findAll();
            }


    @GetMapping("/fournisseurs/{id}")
    public Fournisseur retrieveFournissuer (@PathVariable Long id) throws FournissurNotFoundException {
    Optional<Fournisseur> fournisseur = fournisseurRepository.findById(id);

    if (!fournisseur.isPresent())
        throw new FournissurNotFoundException("id-"+id);
    return fournisseur.get();
    }

    @DeleteMapping("fournisseurs/{id}")
    public void deleteFournisseur(@PathVariable Long id ){
        fournisseurRepository.deleteById(id);
}

    @PostMapping("/fournisseurs")
    public ResponseEntity<Object> createFournissuer (@RequestBody Fournisseur fournisseur){
        Fournisseur saveFournisseur = (Fournisseur) fournisseurRepository.save(fournisseur);

    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveFournisseur.getFournisseur_id()).toUri();
    return ResponseEntity.created(location).build();
    }

    @PutMapping("/fournisseurs/{id}")
    public ResponseEntity<Object> updateFournisseur(@RequestBody Fournisseur fournisseur, @PathVariable Long id){
        Optional<Fournisseur> fournisseurOptional=fournisseurRepository.findById(id);
        if (!fournisseurOptional.isPresent())
            return ResponseEntity.notFound().build();
        fournisseur.setFournisseur_id(id);
        fournisseurRepository.save(fournisseur);

        return ResponseEntity.noContent().build();

    }

}

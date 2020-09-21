package com.example.TransitApp.web.controller;

import com.example.TransitApp.web.Exception.FournissurNotFoundException;
import com.example.TransitApp.web.model.commande;
import com.example.TransitApp.web.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class CommandeController {


    @Autowired
    private CommandeRepository commandeRepository;

    @GetMapping("/commandes")
    public List retreiveAllCommandes(){
        return commandeRepository.findAll();
    }


    @GetMapping("/commande/{id}")
    public commande retrieveCommande (@PathVariable Long id) throws FournissurNotFoundException {
        Optional<commande> commande = commandeRepository.findById(id);

        if (!commande.isPresent())
            throw new FournissurNotFoundException("id-"+id);
        return commande.get();
    }

    @DeleteMapping("commande/{id}")
    public void deleteCommande(@PathVariable Long id ){
        commandeRepository.deleteById(id);
    }

    @PostMapping("/commandes")
    public ResponseEntity<Object> createCommande (@RequestBody commande commande){
        commande saveCommande = (commande) commandeRepository.save(commande);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveCommande.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/commande/{id}")
    public ResponseEntity<Object> updateCommande(@RequestBody commande commande, @PathVariable Long id){
        Optional<commande> commandeOptional=commandeRepository.findById(id);
        if (!commandeOptional.isPresent())
            return ResponseEntity.notFound().build();
        commande.setId(id);
        commandeRepository.save(commande);

        return ResponseEntity.noContent().build();

    }
}

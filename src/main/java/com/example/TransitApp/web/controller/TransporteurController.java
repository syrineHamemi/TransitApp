package com.example.TransitApp.web.controller;

import com.example.TransitApp.web.Exception.ApiExceptionHandler;
import com.example.TransitApp.web.model.transporteur;
import com.example.TransitApp.web.repository.TransporteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController

public class TransporteurController {


    @Autowired
    private TransporteurRepository transporteurRepository;

    @GetMapping("/transporteurs")
    public List retreiveAllTransporteur(){
        return transporteurRepository.findAll();
    }


    @GetMapping("/transporteur/{id}")
    public transporteur retrieveTransporteur(@PathVariable Long id) throws ApiExceptionHandler {
        Optional<transporteur> transporteur = transporteurRepository.findById(id);

        if (!transporteur.isPresent())
            throw new ApiExceptionHandler("id-" + id);
        return transporteur.get();
    }

    @DeleteMapping("transporteur/{id}")
    public void deleteProduit(@PathVariable Long id ){
        transporteurRepository.deleteById(id);
    }

    @PostMapping("/transporteur")
    public ResponseEntity<Object> createProduit(@RequestBody transporteur transporteur){
        transporteur saveTransporteur = transporteurRepository.save(transporteur);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveTransporteur.getTransporteur_id()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/transporteur/{id}")
    public ResponseEntity<Object> updateTransporteur(@RequestBody transporteur transporteur, @PathVariable Long id){
        Optional<transporteur> transporteurOptional=transporteurRepository.findById(id);
        if (!transporteurOptional.isPresent())
            return ResponseEntity.notFound().build();
        transporteur.setTransporteur_id(id);
        transporteurRepository.save(transporteur);

        return ResponseEntity.noContent().build();

    }
}

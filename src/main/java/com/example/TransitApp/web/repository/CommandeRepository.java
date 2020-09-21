package com.example.TransitApp.web.repository;

import com.example.TransitApp.web.model.commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<commande,Long> {
}

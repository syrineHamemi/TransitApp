package com.example.TransitApp.web.repository;

import com.example.TransitApp.web.model.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivraisonRepository extends JpaRepository<Livraison,Long> {
}

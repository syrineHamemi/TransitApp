package com.example.TransitApp.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.TransitApp.web.model.transporteur;

@Repository
public interface TransporteurRepository extends JpaRepository<transporteur, Long> {
}

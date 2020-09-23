package com.example.TransitApp.web.repository;

import com.example.TransitApp.web.model.ERole;
import com.example.TransitApp.web.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}

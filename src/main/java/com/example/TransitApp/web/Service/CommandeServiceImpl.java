package com.example.TransitApp.web.Service;

import com.example.TransitApp.web.model.commande;
import com.example.TransitApp.web.repository.CommandeRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Service
@Transactional

public class CommandeServiceImpl implements CommandeService {

    private CommandeRepository CommandeRepository;

    @Override
    public Iterable<commande> getAllOrders() {
        return this.CommandeRepository.findAll();
    }

    @Override
    public commande create(commande order) {
        order.setDate(LocalDate.now());
        return this.CommandeRepository.save(order);
    }

    @Override
    public void update(commande order) {
        this.CommandeRepository.save(order);
    }
}

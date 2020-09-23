package com.example.TransitApp.web.Service;

import com.example.TransitApp.web.model.commande;

public interface CommandeService {
    Iterable<commande> getAllOrders();

    commande create(commande order);

    void update(commande order);
}

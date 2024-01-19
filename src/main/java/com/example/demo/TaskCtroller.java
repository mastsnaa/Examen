package com.example.demo;

import org.springframework.scheduling.config.Task;

import java.util.List;
import java.util.Optional;

public class TaskCtroller {
    private GestionTaches gestionTaches;

    public TaskController(GestionTaches gestionTaches) {
        this.gestionTaches = gestionTaches;
    }

    public List<String> getListeTaches() {
        return gestionTaches.getTaches();
    }

    public Optional<Boolean> getEtatTache(String titre) {
        try {
            boolean etat = gestionTaches.verifierTache(titre);
            return Optional.of(etat);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}

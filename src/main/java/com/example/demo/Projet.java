package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Projet {
    private String nom;
    private List<Tache> taches;
    private GestionTaches gestionTaches;

    public Projet(String nom, GestionTaches gestionTaches) {
        this.nom = nom;
        this.taches = new ArrayList<>();
        this.gestionTaches = gestionTaches;
    }

    public void ajouterTache(Tache tache) {
        taches.add(tache);
        gestionTaches.ajouterTache(tache.getTitre(), tache.getDescription());
    }

    public List<Tache> getTaches() {
        return taches;
    }
}

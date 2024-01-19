package com.example.demo;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ProjetTest {
   private GestionTaches gestionTaches = new GestionTaches();
   private  Projet projet = new Projet("Projet Test", gestionTaches);
    @Test
    public void testAjouterTacheAuProjet() throws TacheInexistante {
        GestionTaches gestionTaches = new GestionTaches();
        Projet projet = new Projet("Projettest1", gestionTaches);
        // Créez une tâche et ajoutez-la au projet
        Tache tache = new Tache("tâche 1", "Description de la tâche 1");
        projet.ajouterTache(tache);

        // Vérifiez si la tâche a été correctement ajoutée au projet
        assertTrue(projet.getTaches().contains(tache));
        assertEquals(1, projet.getTaches().size());

        // Vérifiez si la tâche a également été ajoutée à la classe GestionTaches
        assertTrue(gestionTaches.verifierTache("tâche 1"));
    }

}


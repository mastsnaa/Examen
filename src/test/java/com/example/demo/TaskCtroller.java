package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class TaskCtroller {
    private GestionTaches gestionTaches;
    private TaskCtroller controller;

    @BeforeEach
    public void setUp() {
        gestionTaches = new GestionTaches();
        controller = new TaskCtroller(gestionTaches);
        gestionTaches.ajouterTache("Tache1", "Description de Tache1");
    }

    @Test
    public void testGetListeTaches() {
        assertEquals(Arrays.asList("Tache1"), controller.getListeTaches());
    }

    @Test
    public void testGetEtatTacheExistante() throws Exception {
        gestionTaches.completerTache("Tache1");
        Optional<Boolean> etat = controller.getEtatTache("Tache1");
        assertTrue(etat.isPresent() && etat.get());
    }

    @Test
    public void testGetEtatTacheInexistante() {
        Optional<Boolean> etat = controller.getEtatTache("TacheInexistante");
        assertFalse(etat.isPresent());
    }
}

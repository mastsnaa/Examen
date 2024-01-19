package com.example.demo;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UtilitaireTest {
    @Test
    public void testCalculerDureeTotale() {
        List<Tache> taches = Collections.emptyList();

        int resultat = Utilitaire.calculerDureeTotale(taches);

        assertEquals(0, resultat);
    }

    @Test
    public void testCalculerDureeTotaleAvecTachesPositives() {
        // Créez des tâches avec des durées positives
        Tache tache1 = Mockito.mock(Tache.class);
        Mockito.when(tache1.getDuree()).thenReturn(5);

        Tache tache2 = Mockito.mock(Tache.class);
        Mockito.when(tache2.getDuree()).thenReturn(10);

        List<Tache> taches = Arrays.asList(tache1, tache2);

        int resultat = Utilitaire.calculerDureeTotale(taches);

        assertEquals(15, resultat);
    }

    @Test
    public void testCalculerDureeTotaleAvecTachesNegatives() {
        // Créez des tâches avec des durées négatives
        Tache tache1 = Mockito.mock(Tache.class);
        Mockito.when(tache1.getDuree()).thenReturn(-5);

        Tache tache2 = Mockito.mock(Tache.class);
        Mockito.when(tache2.getDuree()).thenReturn(-10);

        List<Tache> taches = Arrays.asList(tache1, tache2);

        int resultat = Utilitaire.calculerDureeTotale(taches);

        assertEquals(0, resultat);  // Durée négative est ignorée, donc la durée totale est 0
    }
}

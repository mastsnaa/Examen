package com.example.demo;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Utilitaire {
    public static int calculer(List<Tache> taches) {
        int dureeTotale = 0;
        for (Tache tache : taches) {
            // Ignorer les durées négatives
            if (tache.getDuree() > 0) {
                dureeTotale = dureeTotale + tache.getDuree();
            }
        }
        return dureeTotale;
    }

    public static int calculerDureeTotale(List<Tache> taches) {

        return 0;
    }
}

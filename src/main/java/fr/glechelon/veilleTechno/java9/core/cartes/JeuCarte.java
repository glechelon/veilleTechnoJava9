package fr.glechelon.veilleTechno.java9.core.cartes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JeuCarte {

    private final List<Carte> cartes = new ArrayList<>();


    private JeuCarte() {
        //Constructeur vide, passer par le builder
    }

    public static JeuCarte build() {
        JeuCarte jeuCarte = new JeuCarte();
        Arrays.asList(Couleurs.values()).forEach(couleur -> {
            jeuCarte.cartes.addAll(Arrays.stream(ValeursCartes.values())
                    .map(valeur -> new Carte(couleur, valeur))
                    .collect(Collectors.toList()));
        });
        return jeuCarte;
    }

    public Set<Carte> getFigures(){
        //return cartes.stream().takeWhile(carte -> carte)
        return null;
    }

    public Set<Carte> prendreCinqPremieresCartes() {
        return Set.of(cartes.get(51), cartes.get(50), cartes.get(49), cartes.get(48), cartes.get(47)); //Pas beau mais c'est pour tester le Set.of()
    }

    public List<Carte> getCartes() {
        return cartes;
    }
}

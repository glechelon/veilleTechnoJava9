package fr.glechelon.veilleTechno.java9.core.cartes;

import java.util.Objects;

public class Carte {

    private final Couleurs couleur;

    private final ValeursCartes valeur;


    public Carte(Couleurs couleur, ValeursCartes valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }


    @Override
    public String toString() {
        return "Carte{" +
                "couleur=" + couleur +
                ", valeurs=" + valeur +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carte carte = (Carte) o;
        return couleur == carte.couleur &&
                valeur == carte.valeur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(couleur, valeur);
    }

    public boolean isFigure() {
        return valeur.getPoints() > 10 && valeur.getPoints() < 14;
    }


    public Couleurs getCouleur() {
        return couleur;
    }
}

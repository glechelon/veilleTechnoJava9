package fr.glechelon.veilleTechno.java9.core.cartes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

class JeuCarteTest {


    @Test
    public void testBuild() {
        //GIVEN

        //WHEN
        JeuCarte jeuCarte = JeuCarte.build();

        //THEN
        System.out.println(jeuCarte.getCartes().toString());
        Assertions.assertEquals(52, jeuCarte.getCartes().size());
    }

    @Test
    public void testPrendreCinqPremieresCartes() {

        //GIVEN
        JeuCarte jeuCarte = JeuCarte.build();

        //WHEN
        Set<Carte> out = jeuCarte.prendreCinqPremieresCartes();

        //THEN
        Assertions.assertTrue(Set.of(
                new Carte(Couleurs.PIQUE, ValeursCartes.AS),
                new Carte(Couleurs.PIQUE, ValeursCartes.ROI),
                new Carte(Couleurs.PIQUE, ValeursCartes.REINE),
                new Carte(Couleurs.PIQUE, ValeursCartes.VALET),
                new Carte(Couleurs.PIQUE, ValeursCartes.DIX)
        ).containsAll(out));
    }


    @Test
    public void testGetPremiereCouleur(){

        //GIVEN
        JeuCarte jeuCarte = JeuCarte.build();

        //WHEN
        Set<Carte> out = jeuCarte.getPremiereCouleur();

        //THEN
        Assertions.assertEquals(13, out.size());
    }




    @Test
    public void testRetirerPremiereCouleur(){

        //GIVEN
        JeuCarte jeuCarte = JeuCarte.build();

        //WHEN
        Set<Carte> out = jeuCarte.retirerPremiereCouleur();

        //THEN
        Assertions.assertEquals(39, out.size());
    }
}
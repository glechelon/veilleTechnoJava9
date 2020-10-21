package fr.glechelon.veilleTechno.java9.core.cartes;

public enum ValeursCartes {

    DEUX(2),
    TROIS(3),
    QUATRE(4),
    CINQ(5),
    SIX(6),
    SEPT(7),
    HUIT(8),
    NEUF(9),
    DIX(10),
    VALET(11),
    REINE(12),
    ROI(13),
    AS(14);


    private int points;

    private ValeursCartes(int points){
        this.points = points;
    }
}

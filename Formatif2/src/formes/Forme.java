package formes;

import interfaces.IForme;

public abstract class Forme implements IForme {
    // Constantes
    protected static final Couleur COULEUR_DEFAUT = Couleur.ROUGE;

    // Attributs
    protected String nom;
    protected Couleur couleur;

    // Constructeurs
    public Forme(Couleur couleur) {
        if (validerCouleur(couleur)) {
            this.couleur = couleur;
        }
        else {
            this.couleur = COULEUR_DEFAUT;
        }
        this.nom = getClass().getSimpleName();
    }

    public Forme() {
        this(COULEUR_DEFAUT);
    }

    // Accesseurs
    public String getNom() {
        return this.nom;
    }

    public Couleur getCouleur() {
        return this.couleur;
    }

    // Mutateurs
    public void setCouleur(Couleur couleur) {
        if (validerCouleur(couleur)) {
            this.couleur = couleur;
        }
    }

    public boolean validerCouleur(Couleur couleur) {
        boolean valide = false;
        if (couleur != null) {
            valide = true;
        }
        return valide;
    }
}


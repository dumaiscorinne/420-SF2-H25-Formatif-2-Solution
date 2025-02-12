package formes;

import exceptions.GrandeurFormeException;

public class Rectangle extends Forme {
    private double hauteur;
    private double largeur;

    // Constructeur
    public Rectangle(Couleur couleur, double hauteur, double largeur) {
        super(couleur);
        if (!validerHauteur(hauteur) || !validerLargeur(largeur)) {
            throw new GrandeurFormeException();
        }
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    // Accesseurs
    public double getHauteur() {
        return hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    // Mutateurs
    public void setLargeur(double largeur) {
        if (!validerLargeur(largeur)) {
            throw new GrandeurFormeException();
        }
        this.largeur = largeur;
    }

    public void setHauteur(double hauteur) {
        if (!validerHauteur(hauteur)) {
            throw new GrandeurFormeException();
        }
        this.hauteur = hauteur;
    }

    public boolean validerLargeur(double largeur) {
        return largeur > 0;
    }

    public boolean validerHauteur(double hauteur) {
        return hauteur > 0;
    }

    // Méthode pour calculer l'aire (longueur * largeur)
    @Override
    public double calculerAire() {
        return hauteur * largeur;
    }

    // Méthode pour calculer la surface (même chose que l'aire pour un rectangle)
    @Override
    public double calculerPerimetre() {
        return 2 * hauteur + 2 * largeur;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Même référence, donc égal
        if (obj == null || getClass() != obj.getClass()) return false; // Vérifie la classe

        Rectangle rectangle = (Rectangle) obj; // Cast en Rectangle
        return largeur == rectangle.largeur && hauteur == rectangle.hauteur; // Comparaison des attributs
    }
}


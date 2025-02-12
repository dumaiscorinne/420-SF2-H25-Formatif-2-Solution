package formes;

import exceptions.GrandeurFormeException;

public class Triangle extends Forme {
    private double coteA;
    private double coteB;
    private double coteC;

    // Constructeur
    public Triangle(Couleur couleur, double coteA, double coteB, double coteC) {
        super(couleur);
        if (!validerCotes(coteA, coteB, coteC)) {
            throw new GrandeurFormeException();
        }
        this.coteA = coteA;
        this.coteB = coteB;
        this.coteC = coteC;
    }

    // Vérification si les côtés forment un triangle valide (inégalité triangulaire)
    private boolean validerCotes(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Accesseurs
    public double getCoteA() {
        return coteA;
    }

    public double getCoteB() {
        return coteB;
    }

    public double getCoteC() {
        return coteC;
    }

    // Mutateurs
    public void setCoteA(double coteA) {
        if (!validerCotes(coteA, this.coteB, this.coteC)) {
            throw new GrandeurFormeException();
        }
        this.coteA = coteA;
    }

    public void setCoteB(double coteB) {
        if (!validerCotes(this.coteA, coteB, this.coteC)) {
            throw new GrandeurFormeException();
        }
        this.coteB = coteB;
    }

    public void setCoteC(double coteC) {
        if (!validerCotes(this.coteA, this.coteB, coteC)) {
            throw new GrandeurFormeException();
        }
        this.coteC = coteC;
    }

    @Override
    public double calculerAire() {
        double s = (coteA + coteB + coteC) / 2; // demi-périmètre
        return Math.sqrt(s * (s - coteA) * (s - coteB) * (s - coteC));
    }

    @Override
    public double calculerPerimetre() {
        return coteA + coteB + coteC;
    }

    public boolean estEquilateral() {
        return ((coteA == coteB) && (coteB == coteC));
    }
}


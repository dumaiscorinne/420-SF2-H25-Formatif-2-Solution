package formes;

import exceptions.GrandeurFormeException;

public class Cercle extends Forme implements Comparable<Cercle>{
    private double rayon;

    public Cercle(Couleur couleur, double rayon){
        super(couleur);
        if (!validerRayon(rayon)) {
            throw new GrandeurFormeException();
        }
        this.rayon = rayon;
    }

    public double getRayon(){
        return this.rayon;
    }

    public void setRayon(double rayon){
        if (!validerRayon(rayon)) {
            throw new GrandeurFormeException();
        }
        this.rayon = rayon;
    }

    public boolean validerRayon(double rayon){
        return rayon > 0;
    }

    @Override
    public double calculerAire() {
        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public int compareTo(Cercle o) {
        return Double.compare(this.rayon, o.rayon);
        // ou...
        // return this.rayon < o.rayon ? -1 : (this.rayon > o.rayon ? 1 : 0);
    }
}

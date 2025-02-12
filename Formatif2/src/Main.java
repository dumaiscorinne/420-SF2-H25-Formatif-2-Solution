import formes.*;
import exceptions.GrandeurFormeException;

public class Main {
    public static void main(String[] args) {
        Cercle c1 = new Cercle(Couleur.VERT, 10);
        Rectangle r = new Rectangle(Couleur.BLEU, 5, 8);
        Triangle t = new Triangle(Couleur.JAUNE, 7, 7, 7);

        System.out.println("Ceci est un programme qui gère des formes");
    }
}
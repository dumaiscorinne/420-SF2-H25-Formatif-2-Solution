package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import formes.Rectangle;
import formes.Couleur;
import exceptions.GrandeurFormeException;

class RectangleTest {

    @Test
    void testConstructeurValide() {
        Rectangle rect = new Rectangle(Couleur.ROUGE, 5.0, 10.0);
        assertEquals(5.0, rect.getHauteur());
        assertEquals(10.0, rect.getLargeur());
    }

    @Test
    void testConstructeurInvalide() {
        assertThrows(GrandeurFormeException.class, () -> new Rectangle(Couleur.BLEU, -5.0, 10.0));
        assertThrows(GrandeurFormeException.class, () -> new Rectangle(Couleur.VERT, 5.0, -10.0));
    }

    @Test
    void testSetLargeurValide() {
        Rectangle rect = new Rectangle(Couleur.ROUGE, 5.0, 10.0);
        rect.setLargeur(15.0);
        assertEquals(15.0, rect.getLargeur());
    }

    @Test
    void testSetLargeurInvalide() {
        Rectangle rect = new Rectangle(Couleur.ROUGE, 5.0, 10.0);
        assertThrows(GrandeurFormeException.class, () -> rect.setLargeur(-5.0));
    }

    @Test
    void testSetHauteurValide() {
        Rectangle rect = new Rectangle(Couleur.ROUGE, 5.0, 10.0);
        rect.setHauteur(20.0);
        assertEquals(20.0, rect.getHauteur());
    }

    @Test
    void testSetHauteurInvalide() {
        Rectangle rect = new Rectangle(Couleur.ROUGE, 5.0, 10.0);
        assertThrows(GrandeurFormeException.class, () -> rect.setHauteur(-3.0));
    }

    @Test
    void testCalculerAire() {
        Rectangle rect = new Rectangle(Couleur.ROUGE, 4.0, 5.0);
        assertEquals(20.0, rect.calculerAire());
    }

    @Test
    void testCalculerPerimetre() {
        Rectangle rect = new Rectangle(Couleur.ROUGE, 4.0, 5.0);
        assertEquals(18.0, rect.calculerPerimetre());
    }

    @Test
    void testEquals() {
        Rectangle rect1 = new Rectangle(Couleur.ROUGE, 4.0, 5.0);
        Rectangle rect2 = new Rectangle(Couleur.BLEU, 4.0, 5.0);
        Rectangle rect3 = new Rectangle(Couleur.ROUGE, 6.0, 5.0);

        assertEquals(rect1, rect2);
        assertNotEquals(rect1, rect3);
    }
}

package exceptions;

public class GrandeurFormeException extends RuntimeException{
    public GrandeurFormeException(){
        super("La grandeur de la forme est invalide");
    }
}

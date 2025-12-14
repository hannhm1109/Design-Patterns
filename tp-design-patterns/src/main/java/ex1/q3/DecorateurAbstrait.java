package ex1.q3;

/**
 * @author hanane
 **/
public class DecorateurAbstrait implements Composant{
    protected Composant composant;
    public DecorateurAbstrait(Composant composant) {
        this.composant = composant;
    }
    @Override
    public void traitement() {
        composant.traitement();
    }
}

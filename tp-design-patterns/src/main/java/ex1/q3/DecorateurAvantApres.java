package ex1.q3;

/**
 * @author hanane
 **/
public class DecorateurAvantApres extends DecorateurAbstrait{
    public DecorateurAvantApres(Composant composant) {
        super(composant);
    }

    @Override
    public void traitement() {
        System.out.println("Avant traitement");
        super.traitement();
        System.out.println("Après traitement");
    }
}

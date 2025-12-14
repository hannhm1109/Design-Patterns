package composants;

/**
 * @author hananee
 **/
public class Espresso extends Boisson{
    public Espresso() {
        description="Espresso";
    }

    @Override
    public double price() {
        return 12;
    }
}

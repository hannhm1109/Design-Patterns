package Decorators;

import composants.Boisson;

/**
 * @author hananee
 **/
public abstract class Decorator extends Boisson {
    protected Boisson boisson;
    public Decorator(Boisson boisson) {
        this.boisson = boisson;
    }
}

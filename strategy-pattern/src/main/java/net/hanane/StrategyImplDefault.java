package net.hanane;

/**
 * @author Hanane
 **/
public class StrategyImplDefault implements IStrategy {

    @Override
    public void operation() {
        System.out.println("----------Default Strategy----------");
    }
}

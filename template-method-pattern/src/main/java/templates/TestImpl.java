package templates;

/**
 * @author hanane
 **/
public class TestImpl extends Template{
    @Override
    public double compute(int a, int b) {
        return Math.cos(a*a+b*b);
    }

    @Override
    public int param1() {
        return 5;
    }
}

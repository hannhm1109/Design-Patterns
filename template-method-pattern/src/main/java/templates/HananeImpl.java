package templates;

/**
 * @author hanane
 **/
public class HananeImpl extends Template{
    @Override
    public double compute(int a, int b) {
        return Math.sqrt(a*a+b*b);
    }

    @Override
    public int param1() {
        return 3;
    }
}

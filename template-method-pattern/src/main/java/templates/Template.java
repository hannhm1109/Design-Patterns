package templates;

/**
 * @author hanane
 **/
public abstract class Template {
    public double perform(int a, int b) {
        int n = param1();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double step1 = compute(a,b);
            sum += step1;
        }
        return sum;
    }

    protected abstract double compute(int a, int b);
    public abstract int param1();
}

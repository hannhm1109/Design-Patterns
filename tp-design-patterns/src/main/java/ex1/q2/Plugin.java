package ex1.q2;

/**
 * @author hanane
 **/
public abstract class Plugin {
    public final void execute() {
        commonStep();
        variableStep1();
        variableStep2();
        commonStepEnd();
    }
    private void commonStep() {
        System.out.println("Common step at start");
    }

    protected abstract void variableStep1();

    protected abstract void variableStep2();

    private void commonStepEnd() {
        System.out.println("Common step at end");
    }
}

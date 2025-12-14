import templates.HananeImpl;
import templates.Template;
import templates.TestImpl;

/**
 * @author hanane
 **/
public class Test {
    public static void main(String[] args) {
        Template template = new HananeImpl();
        System.out.println(template.perform(3,5));
        template = new TestImpl();
        System.out.println(template.perform(3,5));
    }
}

package ex2.filter;

/**
 * @author hanane
 **/
public class ImplNonStandard {
    public int[] appliquerFiltre(String filterName, int[] data){
        System.out.println("ImplNonStandard: "+filterName);
        return data;
    }
}

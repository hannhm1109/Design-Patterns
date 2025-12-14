package ex2.filter;

/**
 * @author hanane
 **/
public class ImplNonStandardAdapter implements FilterStrategy{
    private ImplNonStandard implNonStandard;
    private String filterName;

    public ImplNonStandardAdapter(ImplNonStandard implNonStandard, String filterName) {
        this.implNonStandard = implNonStandard;
        this.filterName = filterName;
    }


    @Override
    public int[] filter(int[] data) {
        return implNonStandard.appliquerFiltre(filterName, data);
    }
}

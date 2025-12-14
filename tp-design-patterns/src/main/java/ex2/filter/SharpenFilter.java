package ex2.filter;

/**
 * @author hanane
 **/
public class SharpenFilter implements FilterStrategy{
    @Override
    public int[] filter(int[] data) {
        System.out.println("SharpenFilter: apply sharpen");
        return data;
    }
}

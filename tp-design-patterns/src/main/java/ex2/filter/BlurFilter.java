package ex2.filter;

/**
 * @author hanane
 **/
public class BlurFilter implements FilterStrategy{
    @Override
    public int[] filter(int[] data) {
        System.out.println("BlurFilter: apply blur");
        return data;
    }
}

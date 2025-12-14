package ex1.q1;

/**
 * @author hanane
 **/
public class Rectangle implements Figure {
    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle at (" + x + ", " + y + ") w=" + width + " h=" + height);
    }
}

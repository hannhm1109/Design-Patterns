package ex1.q1;

/**
 * @author hanane
 **/
public class Circle implements Figure {
    private double radius;
    private double x;
    private double y;
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Circle at (" + x + ", " + y + ") r=" + radius);
    }
}

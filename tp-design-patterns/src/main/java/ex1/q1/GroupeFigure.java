package ex1.q1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hanane
 **/
public class GroupeFigure implements Figure {
    private List<Figure> figures = new ArrayList<Figure>();
    public void add(Figure f) {
        figures.add(f);
    }

    public void remove(Figure f) {
        figures.remove(f);
    }
    @Override
    public void draw() {
        System.out.println("Drawing GroupFigure with " + figures.size() + " children");
        for (Figure f : figures) {
            f.draw();
        }
    }
}

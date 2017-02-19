package decorateur;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractShape implements Shape{

    private List<Point2D> points;

    protected AbstractShape() {
        this.points = new ArrayList<>();
    }



    public void addPoints(Point2D ... points){
        Collections.addAll(this.points, points);
    }

    @Override
    public int pointCount() {
        return this.points.size();
    }

    @Override
    public Point2D point(int index) {
        return this.points.get(index);
    }

    @Override
    public abstract void draw(GraphicsContext context);
}

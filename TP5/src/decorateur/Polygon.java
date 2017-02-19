package decorateur;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Polygon extends AbstractShape {

    private Color color;

    public Polygon(Color color, Point2D ... points) {
        super();
        addPoints(points);
        this.color = color;
    }

    public void draw(GraphicsContext context){
        context.setFill(color);
        int n = pointCount();
        double[] xs = new double[n];
        double[] ys = new double[n];
        for(int i = 0; i < n; ++i){
            xs[i] = point(i).getX();
            ys[i] = point(i).getY();
        }
        context.fillPolygon(xs, ys, n);
    }
}

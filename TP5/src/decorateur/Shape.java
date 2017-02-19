package decorateur;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public interface Shape {

    int pointCount();
    Point2D point(int index);
    void draw(GraphicsContext context);
}

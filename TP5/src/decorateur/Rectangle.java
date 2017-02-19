package decorateur;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends AbstractShape {

    private Color color;

    public Rectangle(Color color, Point2D p1, Point2D p2) {
        super();
        addPoints(p1);
        addPoints(p2);
        this.color = color;
    }

    public void draw(GraphicsContext context){
        context.setFill(color);
        context.fillRect(point(0).getX(), point(0).getY(), point(1).getX() - point(0).getX(), point(1).getY() - point(0).getY());
    }
}

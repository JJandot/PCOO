package decorateur;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public abstract class Decorator implements Shape{

    private Shape shape;

    public Decorator(Shape shape) {
        this.shape = shape;
    }


    @Override
    public int pointCount() {
        return shape.pointCount();
    }

    @Override
    public Point2D point(int index) {
        return shape.point(index);
    }

    @Override
    public void draw(GraphicsContext context) {

    }

    protected void drawDecoration(GraphicsContext context){

    }
}

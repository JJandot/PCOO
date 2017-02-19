package decorateur;

import javafx.scene.canvas.GraphicsContext;

public class CenterDecorator extends Decorator {

    private double radius;

    public CenterDecorator(Shape shape, double radius) {
        super(shape);
        this.radius = radius;
    }

    @Override
    protected void drawDecoration(GraphicsContext context) {

    }
}

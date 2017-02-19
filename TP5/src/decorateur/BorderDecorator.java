package decorateur;

import javafx.scene.canvas.GraphicsContext;

public class BorderDecorator extends Decorator {

    private double radius;

    public BorderDecorator(Shape shape, double radius) {
        super(shape);
        this.radius = radius;
    }

    @Override
    protected void drawDecoration(GraphicsContext context) {

    }
}

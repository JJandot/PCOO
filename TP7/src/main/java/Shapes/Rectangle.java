package Shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle implements Shape{

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

    public void translate(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void paint(GraphicsContext graphicsContext) {
        graphicsContext.setFill(Color.rgb(200, 0, 0, 0.2));
        graphicsContext.fillRect(x, y, width, height);
        graphicsContext.strokeRect(x, y, width, height);
    }

    public boolean contains(double dx, double dy) {
        return (x <= dx && x + width >= dx) && (y <= dy && y + height >= dy);
    }
}

package Shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Circle implements Shape{

    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void translate(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void paint(GraphicsContext graphicsContext) {
        graphicsContext.setFill(Color.rgb(0, 200, 0, 0.2));
        graphicsContext.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
        graphicsContext.strokeOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }

    public boolean contains(double dx, double dy) {
        double distance = sqrt(pow(dx - x, 2) + pow(dy - y, 2));
        return distance <= radius;
    }
}

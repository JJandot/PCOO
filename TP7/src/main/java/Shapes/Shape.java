package Shapes;

import javafx.scene.canvas.GraphicsContext;

public interface Shape {

    void translate(double x, double y);

    void paint(GraphicsContext graphicsContext);

    boolean contains(double x, double y);

}

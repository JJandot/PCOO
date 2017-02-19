import javafx.scene.canvas.GraphicsContext;

public interface Shape {

    void paint(GraphicsContext gc);
    boolean contains(double x, double y);
    void translate(double dx, double dy);

    <R> R accept(ShapeVisitor<R> shapeVisitor);

}
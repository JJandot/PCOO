package Drawers;

import Shapes.Shape;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.List;

public class Drawer extends Canvas {

    private List<Shape> shapes;
    final private DrawerContext context;

    /**
     * Creates a new instance of Canvas with the given size.
     *
     * @param width  width of the canvas
     * @param height height of the canvas
     */
    public Drawer(double width, double height) {
        super(width, height);
        setFocusTraversable(true);
        shapes = new ArrayList<>();
        context = new DrawerContext(this);
        setOnKeyPressed(context::keyPressed);
        setOnMousePressed(context::mousePressed);
        setOnMouseReleased(context::mouseReleased);
        setOnMouseMoved(context::mouseMoved);
    }

    public void add(Shape shape){
        shapes.add(shape);
    }

    public void repaint(){
        GraphicsContext gc = this.getGraphicsContext2D();
        gc.clearRect(0, 0, getWidth(), getHeight());
        for(Shape s : shapes){
            s.paint(gc);
        }
    }

    public Shape shapeContaining(double x, double y){
        for(int i = shapes.size() - 1; i >= 0; --i){
            Shape s = shapes.get(i);
            if (s.contains(x, y))
                return s;
        }
        return null;
    }
}

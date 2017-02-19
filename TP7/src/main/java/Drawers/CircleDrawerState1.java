package Drawers;

import Shapes.Circle;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class CircleDrawerState1 implements DrawerState{

    private Point2D center;
    private Point2D point;

    public CircleDrawerState1(Point2D center) {
        this.center = center;
    }

    public void mousePressed(DrawerContext context, double x, double y) {

    }

    public void mouseReleased(DrawerContext context, double x, double y) {
        point = new Point2D(x, y);
        paint(context.drawer().getGraphicsContext2D());
        context.setState(new NullDrawerState());
    }

    public void mouseMoved(DrawerContext context, double x, double y) {

    }

    public void paint(GraphicsContext graphicsContext) {
        Circle circle = new Circle(center.getX(), center.getY(), sqrt(pow(center.getX() - point.getX(), 2) + pow(center.getY() - point.getY(), 2)));
        circle.paint(graphicsContext);
    }
}

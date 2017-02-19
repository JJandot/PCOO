package Drawers;

import Shapes.Rectangle;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public class RectangleDrawerState1 implements DrawerState{

    private Point2D initPoint;
    private Point2D point;

    public RectangleDrawerState1(Point2D point) {
        initPoint = point;
    }

    public void mousePressed(DrawerContext context, double x, double y) {
    }

    public void mouseReleased(DrawerContext context, double x, double y) {

        double tX, tY, pX, pY;
        if(x < initPoint.getX()){
            tX = x;
            pX = initPoint.getX();
        }
        else {
            tX = initPoint.getX();
            pX = x;
        }
        if(y < initPoint.getY()){
            tY = y;
            pY = initPoint.getY();
        }
        else {
            tY = initPoint.getY();
            pY = y;
        }

        initPoint = new Point2D(tX, tY);
        point = new Point2D(pX, pY);
        paint(context.drawer().getGraphicsContext2D());
        context.setState(new NullDrawerState());
    }

    public void mouseMoved(DrawerContext context, double x, double y) {
    }

    public void paint(GraphicsContext graphicsContext) {
        Rectangle rectangle = new Rectangle(initPoint.getX(), initPoint.getY(), point.getX() - initPoint.getX(), point.getY() - initPoint.getY());
        rectangle.paint(graphicsContext);
    }
}

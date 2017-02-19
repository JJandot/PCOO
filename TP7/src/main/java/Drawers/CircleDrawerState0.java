package Drawers;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public class CircleDrawerState0 implements DrawerState{


    public void mousePressed(DrawerContext context, double x, double y) {

    }

    public void mouseReleased(DrawerContext context, double x, double y) {
        Point2D point = new Point2D(x, y);
        context.setState(new CircleDrawerState1(point));
    }

    public void mouseMoved(DrawerContext context, double x, double y) {

    }

    public void paint(GraphicsContext graphicsContext) {
        System.out.println("Circle : State 0");
    }
}

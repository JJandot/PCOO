package Drawers;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public class RectangleDrawerState0 implements DrawerState{

    public void mousePressed(DrawerContext context, double x, double y) {}

    public void mouseReleased(DrawerContext context, double x, double y) {
        Point2D point = new Point2D(x, y);
        context.setState(new RectangleDrawerState1(point));
    }

    public void mouseMoved(DrawerContext context, double x, double y) {}

    public void paint(GraphicsContext graphicsContext) {}
}

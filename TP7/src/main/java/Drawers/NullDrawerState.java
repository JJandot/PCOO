package Drawers;

import javafx.scene.canvas.GraphicsContext;

public class NullDrawerState implements DrawerState{

    public void mousePressed(DrawerContext context, double x, double y) {}

    public void mouseReleased(DrawerContext context, double x, double y) {}

    public void mouseMoved(DrawerContext context, double x, double y) {}

    public void paint(GraphicsContext graphicsContext) {}

}

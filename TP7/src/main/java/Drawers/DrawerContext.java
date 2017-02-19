package Drawers;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;


public class DrawerContext {

    private DrawerState state;
    private Drawer drawer;

    public DrawerContext(Drawer drawer) {
        this.drawer = drawer;
        state = new NullDrawerState();
    }

    public Drawer drawer() {
        return drawer;
    }

    public void keyPressed(KeyEvent event){
        switch (event.getCode()){
            case C:
                state = new CircleDrawerState0();
                System.out.println("C pressed");
                break;
            case R:
                state = new RectangleDrawerState0();
                System.out.println("R pressed");
                break;
            default:
                break;
        }
        System.out.println("State = " + state.toString());
    }

    public void paint(GraphicsContext graphicsContext){
        state.paint(graphicsContext);
    }

    public void mousePressed(MouseEvent event){
        state.mousePressed(this, event.getX(), event.getY());
    }

    public void mouseReleased(MouseEvent event){
        state.mouseReleased(this, event.getX(), event.getY());
    }

    public void mouseMoved(MouseEvent event){
        state.mouseMoved(this, event.getX(), event.getY());
    }

    public void setState(DrawerState state) {
        this.state = state;
    }
}

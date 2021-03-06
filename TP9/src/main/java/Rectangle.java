import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle implements Shape {

    public double x;
    public double y;
    public double width;
    public double height;

    public Rectangle(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void paint(GraphicsContext gc){
        gc.setFill(Color.rgb(255,0,0,0.2));
        gc.fillRect(x, y, width, height);
        gc.strokeRect(x, y, width, height);
    }

    public boolean contains(double dx, double dy){
        return  (x <= dx && dx <= x+width) &&
                (y <= dy && dy <= y+height);
    }

    public void translate(double dx, double dy){
        x+=dx;
        y+=dy;
    }

    @Override
    public <R> R accept(ShapeVisitor<R> shapeVisitor) {
        return shapeVisitor.visit(this);
    }
}
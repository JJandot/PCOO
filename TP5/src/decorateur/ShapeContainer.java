package decorateur;

import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.List;

public class ShapeContainer {

    private List<Shape> shapes;

    public ShapeContainer(){
        this.shapes = new ArrayList<>();
    }

    public void add(Shape shape){
        this.shapes.add(shape);
    }

    public void draw(GraphicsContext context){
        for(Shape shape : shapes)
            shape.draw(context);
    }
}

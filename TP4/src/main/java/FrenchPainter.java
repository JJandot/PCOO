import javafx.scene.canvas.GraphicsContext;

public class FrenchPainter implements Painter {

    private GraphicsContext graphicsContext;

    public FrenchPainter(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
    }

    public void drawRec(float x, float y, float width, float height){
        graphicsContext.strokeRect(x, y, width, height);
    }

    public void drawCircle(float x, float y, float rayon){
        graphicsContext.strokeOval(x-rayon, y-rayon, rayon*2, rayon*2);
    }
}

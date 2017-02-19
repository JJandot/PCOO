import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import org.info.painter.EnglishPainter;

public class Truck extends Canvas {

    public Truck(){
        super(130, 110);
        GraphicsContext graphicsContext = this.getGraphicsContext2D();
        Painter painter = new EnglishPainterAdapter(new EnglishPainter(graphicsContext));
        draw(painter);
    }

    private void draw(Painter painter){
        painter.drawRec(10, 10, 70, 70);
        painter.drawRec(80, 45, 40, 35);
        painter.drawCircle(40, 80, 10);
        painter.drawCircle(100, 80, 10);
    }
}

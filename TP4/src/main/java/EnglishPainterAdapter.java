import javafx.geometry.Point2D;
import org.info.painter.EnglishPainter;


public class EnglishPainterAdapter implements Painter{

    private EnglishPainter englishPainter;

    public EnglishPainterAdapter(EnglishPainter englishPainter) {
        this.englishPainter = englishPainter;
    }

    public void drawRec(float x, float y, float width, float height) {
        Point2D p1 = new Point2D(x, y);
        Point2D p2 = new Point2D(x+width, y+height);
        englishPainter.paintRectangle(p1, p2);
    }

    public void drawCircle(float x, float y, float rayon) {
        Point2D centre = new Point2D(x, y);
        Point2D bord = new Point2D(x, y + rayon);
        englishPainter.paintCircle(centre, bord);
    }
}

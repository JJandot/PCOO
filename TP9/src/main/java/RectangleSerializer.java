import java.util.Scanner;

public class RectangleSerializer implements ShapeSerializer<Rectangle> {

    @Override
    public String code() {
        return "Rectangle";
    }

    @Override
    public String serialize(Rectangle rectangle) {
        return code() + " " + rectangle.x + " " + rectangle.y + " " + rectangle.width + " " + rectangle.height;
    }

    @Override
    public Rectangle unserialize(String rectangle) {
        String[] coords = rectangle.split(" ");
        return new Rectangle(Double.valueOf(coords[1]), Double.valueOf(coords[2]), Double.valueOf(coords[3]), Double.valueOf(coords[4]));
    }
}

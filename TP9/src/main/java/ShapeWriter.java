import java.io.*;

public class ShapeWriter implements ShapeVisitor<String>{

    public static ShapeWriter instance = new ShapeWriter();

    public static void write(File file, Iterable<Shape> shapes) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        for (Shape shape : shapes) {
            String string = shape.accept(instance);
            bw.write(string);
            bw.close();
        }
    }

    @Override
    public String visit(Rectangle rectangle) {
        RectangleSerializer rectangleSerializer = new RectangleSerializer();
        return rectangleSerializer.serialize(rectangle);
    }

    @Override
    public String visit(Circle circle) {
        CircleSerializer circleSerializer = new CircleSerializer();
        return circleSerializer.serialize(circle);
    }
}

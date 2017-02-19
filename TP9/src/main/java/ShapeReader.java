import java.io.*;
import java.util.*;

public class ShapeReader {

    private static Map<String, ShapeSerializer<? extends Shape>> map = new HashMap<>();

    static {
        CircleSerializer circleSerializer = new CircleSerializer();
        map.put(circleSerializer.code(), circleSerializer);

        RectangleSerializer rectangleSerializer = new RectangleSerializer();
        map.put(rectangleSerializer.code(), rectangleSerializer);
    }

    public static Shape scanLine(String line) throws IOException {
        Scanner scanner = new Scanner(line);
        String code = scanner.next();

        ShapeSerializer<? extends Shape> shapeSerializer = map.get(code);
        if(shapeSerializer == null) throw new IOException();
        return shapeSerializer.unserialize(line);
    }

    public static List<Shape> read(File f) throws IOException {
        List<Shape> shapes = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
        String s;
        while ((s = br.readLine()) != null)
            shapes.add(scanLine(s));

        return shapes;
    }
}

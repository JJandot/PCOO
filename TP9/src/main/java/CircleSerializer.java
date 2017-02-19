public class CircleSerializer implements ShapeSerializer<Circle>{

    @Override
    public String code() {
        return "Circle";
    }

    @Override
    public String serialize(Circle circle) {
        return code() + " " + circle.x + " " + circle.y + " " + circle.radius;
    }

    @Override
    public Circle unserialize(String circle) {
        String[] coords = circle.split(" ");
        return new Circle(Double.valueOf(coords[1]), Double.valueOf(coords[2]), Double.valueOf(coords[3]));
    }
}

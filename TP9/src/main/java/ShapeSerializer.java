public interface ShapeSerializer<S extends Shape> {

    String code();
    String serialize(S s);
    S unserialize(String s);
}

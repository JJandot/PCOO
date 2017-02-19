public interface ShapeVisitor<R> {

    R visit(Rectangle rectangle);
    R visit(Circle circle);

}

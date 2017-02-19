import java.util.Iterator;

public class Grid<T> implements Iterable{

    /**
     * the matrix filled with T elements
     */
    private T[][] elements;

    /**
     * Constructor
     * @param element the matrix we are going to work onto
     */
    public Grid(T[][] element) {
        this.elements = element;
    }

    /**
     * Getter.
     * @param line the line where the element is
     * @param column the column where the element is
     * @return the element at the [line][column] position
     */
    public T get(int line, int column){
        return elements[line][column];
    }

    /**
     * Getter.
     * @return the number of line in our matrix
     */
    public int nbLine(){
        return elements.length;
    }

    /**
     * Getter.
     * @return the number of columns in our matrix
     */
    public int nbColumn(){
        return elements[0].length;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {
        return new GridIterator<>(this);
    }
}

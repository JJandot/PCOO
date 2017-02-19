import java.util.Iterator;
import java.util.NoSuchElementException;

public class GridIterator<T> implements Iterator {

    private Grid<T> grid;
    private int nextLine;
    private int nextColumn;

    public GridIterator(Grid<T> grid) {
        this.grid = grid;
        this.nextLine = 0;
        this.nextColumn = 0;
    }


    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
        return nextLine <= grid.nbLine() && nextColumn <= grid.nbColumn();
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public T next() {
        T next = grid.get(nextLine, nextColumn);
        if(nextColumn == grid.nbColumn()) {
            ++this.nextLine;
            this.nextColumn = 0;
        }
        else
            ++this.nextColumn;
        return next;
    }

    /**
     * Removes from the underlying collection the last element returned
     * by this iterator (optional operation).  This method can be called
     * only once per call to {@link #next}.  The behavior of an iterator
     * is unspecified if the underlying collection is modified while the
     * iteration is in progress in any way other than by calling this
     * method.
     *
     * @throws UnsupportedOperationException if the {@code remove}
     *                                       operation is not supported by this iterator
     * @throws IllegalStateException         if the {@code next} method has not
     *                                       yet been called, or the {@code remove} method has already
     *                                       been called after the last call to the {@code next}
     *                                       method
     */
    @Override
    public void remove() {

    }
}

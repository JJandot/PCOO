public class And<T> implements Predicate {


    /**
     * The first test which will be applied
     */
    private Predicate<T> p1;

    /**
     * The second test which will be applied
     */
    private Predicate<T> p2;

    /**
     * Constructor.
     * @param p1 the first tested predicate
     * @param p2 the second tested predicate
     */
    public And(Predicate<T> p1, Predicate<T> p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Check if <code>o</code> reaches the test of the two predicates
     * @param o
     * @return
     */
    @Override
    public boolean test(Object o) {
        return p1.test((T) o) && p2.test((T) o);
    }
}

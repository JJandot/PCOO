public class Leq<T> implements Predicate {


    /**
     * The maximum value, used in <code>test(Object o)</code>
     */
    private Object value;


    /**
     * Constructor.
     * @param value the value which will be setted as a maximum
     */
    public Leq(T value){
        this.value = value;
    }


    /**
     * Check if the object is smaller than <code>value</code>
     * @param o the object which the condition will be apply on
     * @return true if the condition is verified
     */
    @Override
    public boolean test(Object o) {
        return (int)o <= (int)value;
    }
}

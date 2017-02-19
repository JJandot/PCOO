public class Odd implements Predicate{

    /**
     * Check if the object is an odd number
     * @param o the object which the condition will be apply on
     * @return true if the condition is verified
     */
    @Override
    public boolean test(Object o) {
        return ((int)o % 2) == 1;
    }
}

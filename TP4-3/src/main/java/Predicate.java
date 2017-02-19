public interface Predicate<T> {

    /**
     * Apply a specific condition, depending of the subclass
     * @param t the object which the condition will be apply on
     * @return true if the specific condition is verified
     */
    public boolean test(T t);
}

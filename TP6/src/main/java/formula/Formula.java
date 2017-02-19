package formula;

public interface Formula {

    /**
     * Get the formatted formula string
     * @return the formula currently used
     */
    String asString();

    /**
     * Get the result of the current formula
     * @return the value of the result
     */
    double asValue();
}

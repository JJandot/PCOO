package formula;

public class Constant implements Formula {


    private double value;

    public Constant(double value) {
        this.value = value;
    }

    /**
     * Get the formatted formula string
     *
     * @return the formula currently used
     */
    public String asString() {
        return Double.toString(value);
    }

    /**
     * Get the result of the current formula
     *
     * @return the value of the result
     */
    public double asValue() {
        return value;
    }
}
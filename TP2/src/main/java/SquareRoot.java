/*
 * Copyright (c)
 */

import static java.lang.StrictMath.sqrt;

public class SquareRoot implements Formula{

    /**
     * The formula which will be rooted
     */
    private Formula formula;

    /**
     * Constructor
     * @param formula The formula which will be rooted
     */
    public SquareRoot(Formula formula) {
        this.formula = formula;
    }

    /**
     * Get a formatted string of the current root
     * @return the formatted string
     */
    public String asString() {
        return '\u221a' + this.formula.asString();
    }

    /**
     * Get the value of the current rooted value
     * @return the value of the current rooted value
     */
    public double asValue() {
        return sqrt(this.formula.asValue());
    }
}

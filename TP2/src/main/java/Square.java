/*
 * Copyright (c)
 */

import static java.lang.Math.pow;

public class Square implements Formula {

    /**
     * The formula which will be squared
     */
    private Formula formula;

    /**
     * Constructor
     * @param formula The formula which will squared
     */
    public Square(Formula formula) {
        this.formula = formula;
    }

    /**
     * Get a formatted string of the current squared value
     * @return the formatted string
     */
    public String asString() {
        return this.formula.asString() + "^2";
    }

    /**
     * Get the value of the current squared value
     * @return the value of the current squared value
     */
    public double asValue() {
        return pow(this.formula.asValue(), 2);
    }
}

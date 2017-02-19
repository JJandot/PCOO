/*
 * Copyright (c)
 */

import static java.lang.Math.abs;

public class AbsoluteValue implements Formula {

    /**
     * The formula which will be return as an absolute value
     */
    private Formula formula;

    /**
     * Constructor
     * @param formula The formula which will be return as an absolute value
     */
    public AbsoluteValue(Formula formula) {
        this.formula = formula;
    }

    /**
     * Get a formatted string of the current absolute value
     * @return the formatted string
     */
    public String asString() {
        return "|" + this.formula.asString() + "|";
    }

    /**
     * Get the value of the current absolute value
     * @return the value of the current absolute value
     */
    public double asValue() {
        return abs(this.formula.asValue());
    }
}

/*
 * Copyright (c)
 */

import static java.lang.Math.pow;

public class Power implements Formula{

    /**
     * The formula which will be powered
     */
    private Formula formula;

    /**
     * The power which will be applied on the formula
     */
    private int power;

    /**
     * Constructor
     * @param formula The formula which will be powered
     * @param power the power which will be applied on the formula
     */
    public Power(Formula formula, int power) {
        this.formula = formula;
        this.power = power;
    }

    /**
     * Get a formatted string of the current powered value
     * @return the formatted string
     */
    public String asString() {
        return this.formula.asValue() + "^" + this.power;
    }

    /**
     * Get the value of the current powered value
     * @return the value of the current powered value
     */
    public double asValue() {
        return pow(this.formula.asValue(), this.power);
    }
}

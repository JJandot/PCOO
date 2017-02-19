public class Sum extends VariadicOperator {

    /**
     * the two summed formulas
     */
    private Formula f1, f2;


    /**
     * Constructor. Sets the two formulas which will be summed
     * @param f1 the first formula
     * @param f2 the second formula
     */
    public Sum(Formula f1, Formula f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    /**
     * Get a formatted string of the current sum
     * @return the formatted string
     */
    public String asString() {
        return "(" + this.f1.asString() + this.symbol() + this.f2.asString() + ")";
    }

    /**
     * Get the value of the current sum
     * @return the value of the current sum
     */
    public double asValue() {
        return this.f1.asValue() + this.f2.asValue();
    }

    /**
     * Get the sum symbol
     * @return the specified symbol for a sum
     */
    private String symbol(){
        return "+";
    }

    private double initialValue(){
        return 0;
    }

    private double cumulativeValue(){
        return initialValue() + this.asValue();
    }
}

package formula.extension;

import formula.Formula;

public class Sum extends VariadicOperator {

    /**
     * the two summed formulas
     */
    private Formula[] formulas;



    public Sum(Formula ... formulas) {
        super(formulas);
    }

    /**
     * Get the sum symbol
     * @return the specified symbol for a sum
     */
    protected String symbol(){
        return "+";
    }

    protected double initialValue(){
        return 0;
    }

    protected double cumulativeValue(double accumultor, double value) {
        return accumultor + value;
    }
}

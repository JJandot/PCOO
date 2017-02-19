package formula.extension;

import formula.Formula;

public class Product extends VariadicOperator {
    /**
     * the two multiplied formulas
     */
    private Formula[] formulas;


    /**
     * Constructor. Sets the two formulas which will be multiplied
     */
    public Product(Formula ... formulas) {
        super(formulas);
    }

    /**
     * Get the product symbol
     * @return the specified symbol for a product
     */
    protected String symbol(){
        return "*";
    }

    protected double initialValue(){
        return 1;
    }

    protected double cumulativeValue(double accumultor, double value) {
        return accumultor * value;
    }

}

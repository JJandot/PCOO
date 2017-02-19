package Operations;

import Visitors.FormulaVisitor;

public class Product extends VariadicOperator {

    private Formula[] formulas;

    public Product(Formula... formulas) {
        super(formulas);
    }

    @Override
    public String symbol() {
        return "*";
    }

    @Override
    public double initialValue() {
        return 1.0;
    }

    @Override
    public double cumulativeValue(double acc, double value) {
        return acc * value;
    }


    public <T> T accept(FormulaVisitor visitor) {
        return (T) visitor.visit(this);
    }
}

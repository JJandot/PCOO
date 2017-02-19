package formula.extension;

import formula.Formula;

public abstract class VariadicOperator implements Formula {

    private Formula[] formulas;

    public VariadicOperator(Formula ... formulas) {
        this.formulas = formulas;
    }

    /**
     * Get the formatted formula string
     *
     * @return the formula currently used
     */
    public String asString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for(Formula f : formulas){
            sb.append(f.asString());
            //sb.append(this.symbol());
        }
        sb.append(")");
        return sb.toString();
    }

    /**
     * Get the result of the current formula
     *
     * @return the value of the result
     */
    public double asValue() {
        double resultat = this.initialValue();
        for(Formula f : formulas){
            resultat = this.cumulativeValue(resultat, f.asValue());
        }
        return resultat;
    }

    protected abstract String symbol();

    protected abstract double initialValue();

    protected abstract double cumulativeValue(double accumultor, double value);
}

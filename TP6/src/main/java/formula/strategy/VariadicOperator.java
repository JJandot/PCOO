package formula.strategy;

import formula.Constant;
import formula.Formula;


public class VariadicOperator implements Formula {


    private Formula[] formulas;
    private Operator operator;


    public VariadicOperator(Operator operator, Formula ... formulas) {
        this.formulas = formulas;
        this.operator = operator;
    }

    /**
     * Get the formatted formula string
     *
     * @return the formula currently used
     */
    public String asString(){
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (Formula f : formulas){
            sb.append(f.asString());
            sb.append(this.operator.symbol());
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        return sb.toString();
    }

    /**
     * Get the result of the current formula
     *
     * @return the value of the result
     */
    public double asValue(){
        double resultat = this.operator.initialValue();
        for (Formula f : formulas){
            resultat = this.operator.cumulativeValue(resultat, f.asValue());
        }
        return resultat;
    }
}
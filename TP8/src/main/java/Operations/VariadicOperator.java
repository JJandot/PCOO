package Operations;

import Visitors.FormulaVisitor;

import java.util.ArrayList;
import java.util.List;

public abstract class VariadicOperator implements Formula{

    private Formula[] formulas;

    public VariadicOperator(Formula ... formulas) {
        this.formulas = formulas;
    }

    public String asString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        for (int i = 0; i < formulas.length; ++i){
            if(i != 0)
                stringBuilder.append(symbol());
            stringBuilder.append(formulas[i].asString());
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public double asValue() {
        double result = initialValue();
        for(Formula f : formulas)
            result = cumulativeValue(result, f.asValue());
        return result;
    }

    public List<String> getFormula(){
        List<String> listFormula = new ArrayList<>();
        for (Formula f : formulas)
            listFormula.add(f.asString());
        return listFormula;
    }

    protected abstract String symbol();

    protected abstract double initialValue();

    protected abstract double cumulativeValue(double accumulator, double value);
}

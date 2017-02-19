package strategy;

public class VariadicOperator implements Formula{

    private Formula[] formulas;
    private Operator operator;

    public VariadicOperator(Operator operator, Formula ... formulas) {
        this.formulas = formulas;
        this.operator = operator;
    }

    @Override
    public String asString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        for (int i = 0; i < formulas.length; ++i){
            if(i != 0)
                stringBuilder.append(operator.symbol());
            stringBuilder.append(formulas[i].asString());
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @Override
    public double asValue() {
        double result = operator.initialValue();
        for(Formula f : formulas)
            result = operator.cumulativeValue(result, f.asValue());
        return result;
    }
}

package formula;

import formula.strategy.Product;
import formula.strategy.Sum;
import formula.strategy.VariadicOperator;

public class StrategyFormulaFactory implements AbstractFormulaFactory{

    public Formula createConstant(double value) {
        return new Constant(value);
    }

    public Formula createSum(Formula... formulas) {
        return new VariadicOperator(new Sum(), formulas);
    }

    public Formula createProduct(Formula... formulas) {
        return new VariadicOperator(new Product(), formulas);
    }
}

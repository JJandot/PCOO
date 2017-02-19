package Visitors;

import Operations.Product;
import Operations.Sum;
import Operations.Variable;

public class EvaluatorVisitor implements FormulaVisitor<Double>, ProductVisitor<Double>, SumVisitor<Double>, VariableVisitor<Double>  {

    @Override
    public Double visit(Variable variable) {
        return variable.asValue();
    }

    @Override
    public Double visit(Product product) {
        return product.asValue();
    }

    @Override
    public Double visit(Sum sum) {
        return sum.asValue();
    }
}

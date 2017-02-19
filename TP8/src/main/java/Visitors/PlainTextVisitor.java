package Visitors;

import Operations.Product;
import Operations.Sum;
import Operations.Variable;
import Operations.VariadicOperator;

public class PlainTextVisitor implements FormulaVisitor<String>, ProductVisitor<String>, SumVisitor<String>, VariableVisitor<String> {

    public String visit(Variable variable) {
        return variable.asString();
    }

    public String visit(Product product) {
        return product.asString();
    }

    public String visit(Sum sum) {
        return sum.asString();
    }
}

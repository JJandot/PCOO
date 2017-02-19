package Visitors;

import Operations.Product;
import Operations.Sum;
import Operations.Variable;

public interface FormulaVisitor<R> {

    R visit(Variable variable);
    R visit(Product product);
    R visit(Sum sum);

}

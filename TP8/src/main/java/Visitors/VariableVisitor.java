package Visitors;

import Operations.Variable;

public interface VariableVisitor<R> {

    R visit(Variable variable);

}

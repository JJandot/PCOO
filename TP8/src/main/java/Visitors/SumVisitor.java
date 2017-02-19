package Visitors;

import Operations.Sum;

public interface SumVisitor<R> {

    R visit(Sum sum);

}

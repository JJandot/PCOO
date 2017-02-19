package Operations;

import Visitors.FormulaVisitor;

public interface Formula {

    String asString();
    double asValue();

    <T> T accept(FormulaVisitor visitor);
}

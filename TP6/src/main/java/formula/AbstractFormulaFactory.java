package formula;

public interface AbstractFormulaFactory {

    Formula createConstant(double value);

    Formula createSum(Formula ... formulas);

    Formula createProduct(Formula ... formulas);

}

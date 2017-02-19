package formula;

import formula.extension.Product;
import formula.extension.Sum;

public class ExtensionFormulaFactory implements AbstractFormulaFactory {

    public Formula createConstant(double value) {
        return new Constant(value);
    }

    public Formula createSum(Formula... formulas) {
        return new Sum(formulas);
    }

    public Formula createProduct(Formula... formulas) {
        return new Product(formulas);
    }
}

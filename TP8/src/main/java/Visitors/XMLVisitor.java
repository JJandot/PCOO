package Visitors;

import Operations.Product;
import Operations.Sum;
import Operations.Variable;

import java.util.List;

public class XMLVisitor implements FormulaVisitor<String>, ProductVisitor<String>, SumVisitor<String>, VariableVisitor<String> {

    public String visit(Variable variable) {
        return "<var>" + variable.asString() + "</var>";
    }

    public String visit(Product product) {
        StringBuilder sb = new StringBuilder("<product>");
        List<String> list = product.getFormula();
        for (String s : list)
            sb.append("<var>").append(s).append("</var>");
        sb.append("</product>");
        return sb.toString();
    }

    public String visit(Sum sum) {
        StringBuilder sb = new StringBuilder("<sum>");
        List<String> list = sum.getFormula();
        for (String s : list)
            sb.append("<var>").append(s).append("</var>");
        sb.append("</sum>");
        return sb.toString();    }
}

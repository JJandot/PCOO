package formula;

import java.util.Stack;

public class Calculator {

    private AbstractFormulaFactory formulaFactory;
    private Stack<Formula> formulas;

    public Calculator(AbstractFormulaFactory formulaFactory, Stack<Formula> formulas) {
        this.formulaFactory = formulaFactory;
        this.formulas = formulas;
    }

    public Formula analyse(String ... tokens){
        assert this.formulas.isEmpty();
        for (String token : tokens){
            analyseToken(token);
        }
        return null;
    }

    private void analyseToken(String token){

    }

    private void analyseSum(){

    }

    private void analyseProduct(){

    }

    private void analyseDouble(String token){

    }
}

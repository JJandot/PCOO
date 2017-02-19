/*
 * Copyright (c)
 */

import java.util.List;

public abstract class VariadicOperator implements Formula{


    private Formula[] formulas;

    public VariadicOperator (Formula ... formulas){
        this.formulas = formulas;
    }

    /**
     * Get the formatted formula string
     *
     * @return the formula currently used
     */
    public String asString(){
        return null;
    }

    /**
     * Get the result of the current formula
     *
     * @return the value of the result
     */
    public double asValue(){
        return 0;
    }



}

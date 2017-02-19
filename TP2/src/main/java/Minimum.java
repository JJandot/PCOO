/*
 * Copyright (c)
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Minimum implements Formula{

    /**
     * The list from which we will get the smallest element
     */
    private Variable[] formulaList;


    /**
     * Constructor
     * @param formulaList the list from which we will get the smallest element
     */
    public Minimum(Variable[] formulaList) {
        this.formulaList = formulaList;
    }

    /**
     * Get a formatted string of the current list
     * @return the formatted string
     */
    public String asString() {
        StringBuilder list = new StringBuilder();
        list.append("{");
        for (Variable v : formulaList)
            list.append(v.asString() + ",");
        list.deleteCharAt(list.length()-1);
        list.append("}");
        return list.toString();
    }

    /**
     * Get the value of the current smallest value
     * @return the value of the current smallest value
     */
    public double asValue() {
        double min = formulaList[0].asValue();
        for (Variable v : formulaList)
            if(min > v.asValue())
                min = v.asValue();
        return min;
    }
}

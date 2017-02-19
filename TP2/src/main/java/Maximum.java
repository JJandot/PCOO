/*
 * Copyright (c)
 */

import java.lang.reflect.Array;
import java.util.List;

public class Maximum implements Formula{

    /**
     * The list from which we will get the biggest element
     */
    private Variable[] formulaList;


    /**
     * Constructor
     * @param formulaList the list from which we will get the biggest element
     */
    public Maximum(Variable[] formulaList) {
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
     * Get the value of the current biggest value
     * @return the value of the current biggest value
     */
    public double asValue() {
        double max = formulaList[0].asValue();
        for (Variable v : formulaList)
            if(max < v.asValue())
                max = v.asValue();
        return max;
    }

}

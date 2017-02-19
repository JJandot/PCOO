package Operations;

import Visitors.FormulaVisitor;

public class Variable implements Formula {

    private String name;
    private double value;

    public Variable(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String asString() {
        return this.name;
    }

    public double asValue() {
        return this.value;
    }

    public <T> T accept(FormulaVisitor visitor) {
        return (T) visitor.visit(this);
    }

    public void set(double value){
        this.value = value;
    }
}

package strategy;

public class Variable implements Formula {

    private String name;
    private double value;

    public Variable(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String asString() {
        return this.name;
    }

    @Override
    public double asValue() {
        return this.value;
    }

    public void set(double value){
        this.value = value;
    }
}

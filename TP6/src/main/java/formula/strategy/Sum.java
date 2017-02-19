package formula.strategy;


public class Sum implements Operator {

    public String symbol(){
        return "+";
    }

    public double initialValue(){
        return 0;
    }

    public double cumulativeValue(double accumulator, double value) {
        return accumulator + value;
    }
}
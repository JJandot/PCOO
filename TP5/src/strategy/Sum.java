package strategy;

public class Sum implements Operator {

    @Override
    public String symbol() {
        return "+";
    }

    @Override
    public double initialValue() {
        return 0.0;
    }

    @Override
    public double cumulativeValue(double acc, double value) {
        return acc + value;
    }
}

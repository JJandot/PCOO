package strategy;

public class Product implements Operator {

    @Override
    public String symbol() {
        return "*";
    }

    @Override
    public double initialValue() {
        return 1.0;
    }

    @Override
    public double cumulativeValue(double acc, double value) {
        return acc * value;
    }
}

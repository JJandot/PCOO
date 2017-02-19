package formula.strategy;


public interface Operator {

    String symbol();

    double initialValue();

    double cumulativeValue(double accumulator, double value);

}

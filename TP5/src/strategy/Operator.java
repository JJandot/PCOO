package strategy;

public interface Operator {

    String symbol();
    double initialValue();
    double cumulativeValue(double acc, double value);

}

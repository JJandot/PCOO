import Operations.Sum;
import Operations.Variable;
import Operations.VariadicOperator;

public class App {

    public static void main(String[] args) {
        VariadicOperator v = new Sum(new Variable("x", 5.0), new Variable("y", 10.0), new Variable("z", 2.6));
        System.out.println(v.asString());
        System.out.println(v.asValue());
    }
}

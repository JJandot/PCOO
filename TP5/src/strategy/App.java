package strategy;

public class App {

    public static void main(String[] args) {
        Formula x = new Variable("x", 3);
        Formula y = new Variable("y", 2);
        Formula z = new Variable("z", 6);
        Formula t = new VariadicOperator(new Product(), x, y);
        Formula f = new VariadicOperator(new Sum(), t, z);
        System.out.println(f.asValue());
        System.out.println(f.asString());
    }
}

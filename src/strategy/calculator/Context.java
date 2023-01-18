package strategy.calculator;

public class Context {

    private Calculator calculator;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }

    public int operation(int n1, int n2) {
        return calculator.operation(n1, n2);
    }
}

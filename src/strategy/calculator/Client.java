package strategy.calculator;

public class Client {

    public static void main(String[] args) {
        Context context = new Context(new Add());
        System.out.println("1 + 2 = " + context.operation(1, 2));

        context = new Context(new Sub());
        System.out.println("1 - 2 = " + context.operation(1, 2));

        context = new Context(new Mul());
        System.out.println("1 * 2 = " + context.operation(1, 2));
    }

}

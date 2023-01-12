package Strategy.calculator;

public interface Calculator {

    int operation(int n1, int n2);

}

class Add implements Calculator {
    @Override
    public int operation(int n1, int n2) {
        return n1 + n2;
    }
}

class Sub implements Calculator {
    @Override
    public int operation(int n1, int n2) {
        return n1 - n2;
    }
}

class Mul implements Calculator {
    @Override
    public int operation(int n1, int n2) {
        return n1 * n2;
    }
}
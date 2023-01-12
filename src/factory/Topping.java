package factory;

public enum Topping {
    CHEESE, POTATO, SWEETPOTATO
    ;

    public boolean isCheese() {
        return this == CHEESE;
    }

    public boolean isPotato() {
        return this == POTATO;
    }

    public boolean isSweetPotato() {
        return this == SWEETPOTATO;
    }
}

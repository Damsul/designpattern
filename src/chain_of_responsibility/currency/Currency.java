package chain_of_responsibility.currency;

public class Currency {
    private final int amount;
    public Currency(int money) {
        this.amount = money;
    }

    public int getAmount() {
        return amount;
    }

}
